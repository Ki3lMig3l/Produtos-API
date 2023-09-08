package io.github.ki3lmigu3l.produtos.controllers;

import io.github.ki3lmigu3l.produtos.dtos.ProdutoRecordDTO;
import io.github.ki3lmigu3l.produtos.model.ProdutoModel;
import io.github.ki3lmigu3l.produtos.repositories.ProdutoRepositorio;
import io.github.ki3lmigu3l.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> salvarProduto(@RequestBody @Valid ProdutoRecordDTO produtoRecordDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvar(produtoRecordDTO));
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoModel>> obterProduto(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepositorio.findAll());
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<Object> obterProdutoById(@PathVariable(value = "id") UUID id){
        Optional<ProdutoModel> produtoModelOptional = produtoRepositorio.findById(id);
        if(produtoModelOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado!");
        }

        return ResponseEntity.status(HttpStatus.OK).body(produtoModelOptional.get());
    }

    @PutMapping("/produtos/{id}")
    public ResponseEntity<Object> uptadeProduto(@PathVariable(value = "id") UUID id, @RequestBody @Valid ProdutoRecordDTO produtoRecordDTO){
        Optional<ProdutoModel> produtoModelOptional = produtoRepositorio.findById(id);
        if (produtoModelOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado!");
        }

        var produtoModel = produtoModelOptional.get();
        BeanUtils.copyProperties(produtoRecordDTO, produtoModel);
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepositorio.save(produtoModel));
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Object> deleteProduto (@PathVariable(value = "id") UUID id){
        Optional<ProdutoModel> produtoModelOptional = produtoRepositorio.findById(id);
        if (produtoModelOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado!");
        }

        produtoRepositorio.delete(produtoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso");
    }
}
