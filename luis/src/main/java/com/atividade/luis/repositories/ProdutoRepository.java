package com.atividade.luis.repositories;

import com.atividade.luis.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<PessoaModel, Long> {
}
