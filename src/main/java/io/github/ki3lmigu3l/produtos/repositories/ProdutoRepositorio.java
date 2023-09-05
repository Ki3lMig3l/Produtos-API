package io.github.ki3lmigu3l.produtos.repositories;

import io.github.ki3lmigu3l.produtos.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepositorio extends JpaRepository<ProdutoModel, UUID> {
}
