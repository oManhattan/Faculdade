package com.trabalho_individual.trabalho_individual.logic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho_individual.trabalho_individual.model.dto.MusicaRequest;
import com.trabalho_individual.trabalho_individual.model.entity.MusicaEntity;
import com.trabalho_individual.trabalho_individual.model.repository.MusicaRepository;

@Service
public class MusicaService {
    
    @Autowired
    private MusicaRepository musicaRepository;

    public void salvarNovaMusica(MusicaRequest request) {
        MusicaEntity entity = MusicaEntity.builder()
        .artista(request.getArtista())
        .titulo(request.getTitulo())
        .anoLancamento(request.getAnoLancamento())
        .build();

        musicaRepository.save(entity);
    }

    public List<MusicaEntity> carregarTodasMusicas() {
        return musicaRepository.todasMusicas();
    }

    public void deleteMusic(Long id) throws Exception {
        musicaRepository.deleteById(id);
    }
}
