package com.fazendo.dengue.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tb_dados_dengue")
@Data
public class DengueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cidadeId;
    private String cidadeNome;
    private Integer casos;
    private Integer obitos;
    private LocalDate data;


}
