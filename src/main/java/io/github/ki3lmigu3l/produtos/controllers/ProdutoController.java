package io.github.ki3lmigu3l.produtos.controllers;

import io.github.ki3lmigu3l.produtos.repositories.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;
}
