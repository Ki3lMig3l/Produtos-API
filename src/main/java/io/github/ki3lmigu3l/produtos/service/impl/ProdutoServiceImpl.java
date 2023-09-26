package io.github.ki3lmigu3l.produtos.service.impl;

import io.github.ki3lmigu3l.produtos.model.ProdutoModel;
import io.github.ki3lmigu3l.produtos.repositories.ProdutoRepositorio;
import io.github.ki3lmigu3l.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public ProdutoModel save(@Valid ProdutoModel produtoModel){
        return produtoRepositorio.save(produtoModel);
    }

    @Override
    public Optional<ProdutoModel> findById(UUID id) {
        return produtoRepositorio.findById(id);
    }

    @Override
    public Page<ProdutoModel> findAll(Pageable pageable) {
        return produtoRepositorio.findAll(pageable);
    }

    @Override
    public void delete(ProdutoModel produtoModel) {
        produtoRepositorio.delete(produtoModel);
    }


}
