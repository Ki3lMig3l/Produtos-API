package io.github.ki3lmigu3l.produtos.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record ProdutoRecordDTO(@NotBlank String nome, @NotNull BigDecimal valor) {

}
