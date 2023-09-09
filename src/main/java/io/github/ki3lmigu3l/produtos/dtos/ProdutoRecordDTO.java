package io.github.ki3lmigu3l.produtos.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoRecordDTO(@NotBlank String nome, @NotNull BigDecimal valor) {

}
