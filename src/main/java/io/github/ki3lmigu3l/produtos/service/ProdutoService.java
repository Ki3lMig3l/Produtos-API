package io.github.ki3lmigu3l.produtos.service;

import io.github.ki3lmigu3l.produtos.dtos.ProdutoRecordDTO;
import io.github.ki3lmigu3l.produtos.model.ProdutoModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProdutoService {

    ProdutoModel salvar(ProdutoRecordDTO produtoRecordDTO);
    List<ProdutoModel> obterAllProdutos();
    Optional<ProdutoModel> obterProdutoById(UUID id);
    Optional<ProdutoModel> atualizarProduto(Optional<ProdutoModel> produtoModelOptional, ProdutoRecordDTO produtoRecordDTO);
    void deletarProduto(Optional<ProdutoModel> produtoModelOptional);
}
