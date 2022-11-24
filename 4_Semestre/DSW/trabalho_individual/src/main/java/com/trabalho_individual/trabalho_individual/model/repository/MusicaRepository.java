package com.trabalho_individual.trabalho_individual.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.trabalho_individual.trabalho_individual.model.entity.MusicaEntity;

@Repository
public interface MusicaRepository extends JpaRepository<MusicaEntity, Long> {
    
    @Query(nativeQuery = true, value = "select * from musica")
    List<MusicaEntity> todasMusicas();

}
