package com.atividade.luis.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PRODUTO")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}
