package io.github.ki3lmigu3l.produtos.service;

import io.github.ki3lmigu3l.produtos.dtos.ProdutoRecordDTO;
import io.github.ki3lmigu3l.produtos.model.ProdutoModel;

public interface ProdutoService {

    ProdutoModel salvar(ProdutoRecordDTO produtoRecordDTO);
}
