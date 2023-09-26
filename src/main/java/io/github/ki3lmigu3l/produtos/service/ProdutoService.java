package io.github.ki3lmigu3l.produtos.service;

import io.github.ki3lmigu3l.produtos.model.ProdutoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProdutoService {

    ProdutoModel save(ProdutoModel produtoModel);
    Optional<ProdutoModel> findById(UUID id);
    Page<ProdutoModel> findAll(Pageable pageable);
    void delete(ProdutoModel produtoModel);
}
