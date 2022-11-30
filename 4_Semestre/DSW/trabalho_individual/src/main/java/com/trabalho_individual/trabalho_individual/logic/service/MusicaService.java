package com.trabalho_individual.trabalho_individual.logic.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho_individual.trabalho_individual.model.dto.MusicaRequest;
import com.trabalho_individual.trabalho_individual.model.entity.MusicaEntity;
import com.trabalho_individual.trabalho_individual.model.repository.MusicaRepository;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public void salvarNovaMusica(MusicaRequest request) throws Exception {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<MusicaRequest>> validations = validator.validate(request);
        if (validations.size() > 0) {
            List<String> errors = validations.stream().map((v) -> String.format("%s:%s", v.getPropertyPath().toString(), v.getMessage())).collect(Collectors.toList());
            throw new Exception(errors.toString());
        }


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
