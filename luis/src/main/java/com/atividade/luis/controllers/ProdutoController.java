package com.atividade.luis.controllers;

import com.atividade.luis.models.ProdutoModel;
import com.atividade.luis.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel) {
        return produtoService.criarProduto(produtoModel);
    }

}
