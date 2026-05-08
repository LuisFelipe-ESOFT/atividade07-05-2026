package com.atividade.luis.services;

import com.atividade.luis.models.ProdutoModel;
import com.atividade.luis.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

}
