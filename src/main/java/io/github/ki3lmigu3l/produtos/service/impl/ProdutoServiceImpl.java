package io.github.ki3lmigu3l.produtos.service.impl;

import io.github.ki3lmigu3l.produtos.dtos.ProdutoRecordDTO;
import io.github.ki3lmigu3l.produtos.model.ProdutoModel;
import io.github.ki3lmigu3l.produtos.repositories.ProdutoRepositorio;
import io.github.ki3lmigu3l.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepositorio produtoRepositorio;

    public ProdutoServiceImpl(ProdutoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }

    @Override
    public ProdutoModel salvar(@Valid ProdutoRecordDTO produtoRecordDTO){
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoRecordDTO, produtoModel);
        return produtoRepositorio.save(produtoModel);
    }

    @Override
    public List<ProdutoModel> obterAllProdutos() {
        return produtoRepositorio.findAll();
    }

    @Override
    public Optional<ProdutoModel> obterProdutoById(UUID id) {
        return produtoRepositorio.findById(id);
    }

    @Override
    public Optional<ProdutoModel> atualizarProduto(Optional<ProdutoModel> produtoModelOptional, ProdutoRecordDTO produtoRecordDTO) {
        var produtoModel = produtoModelOptional.get();
        BeanUtils.copyProperties(produtoRecordDTO, produtoModel);
        return Optional.of(produtoRepositorio.save(produtoModel));
    }

    @Override
    public void deletarProduto(Optional<ProdutoModel> produtoModelOptional) {
        produtoRepositorio.delete(produtoModelOptional.get());
    }


}
