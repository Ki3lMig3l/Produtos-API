package io.github.ki3lmigu3l.produtos.service;

import io.github.ki3lmigu3l.produtos.dtos.ProdutoRecordDTO;
import io.github.ki3lmigu3l.produtos.model.ProdutoModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProdutoService {

    ProdutoModel save(ProdutoModel produtoModel);
    Optional<ProdutoModel> findById(UUID id);
    List<ProdutoModel> findAll();
    void delete(ProdutoModel produtoModel);
}
