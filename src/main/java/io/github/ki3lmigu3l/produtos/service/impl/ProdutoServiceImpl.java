package io.github.ki3lmigu3l.produtos.service.impl;

import io.github.ki3lmigu3l.produtos.dtos.ProdutoRecordDTO;
import io.github.ki3lmigu3l.produtos.model.ProdutoModel;
import io.github.ki3lmigu3l.produtos.repositories.ProdutoRepositorio;
import io.github.ki3lmigu3l.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepositorio produtoRepositorio;

    public ProdutoServiceImpl(ProdutoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }

    public ProdutoModel salvar(@Valid ProdutoRecordDTO produtoRecordDTO){
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoRecordDTO, produtoModel);
        return produtoRepositorio.save(produtoModel);
    }
}
