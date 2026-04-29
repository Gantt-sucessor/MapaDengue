package com.fazendo.dengue.DTO;

import com.fazendo.dengue.Entity.DengueEntity;

import java.time.LocalDate;

public record DengueResponseDTO(Long cidadeId, String cidadeNome, Integer casos, Integer obitos, LocalDate data){

    public DengueResponseDTO fromEntity(DengueEntity entity){
        return new DengueResponseDTO(
                entity.getCidadeId(),
                entity.getCidadeNome(),
                entity.getCasos(),
                entity.getObitos(),
                entity.getData()
        );

    }
}