package com.atividade.luis.services;

import com.atividade.luis.models.PessoaModel;
import com.atividade.luis.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<PessoaModel> findAll() {
        return produtoRepository.findAll();
    }

    public PessoaModel criarProduto(PessoaModel pessoaModel) {
        return produtoRepository.save(pessoaModel);
    }

}
