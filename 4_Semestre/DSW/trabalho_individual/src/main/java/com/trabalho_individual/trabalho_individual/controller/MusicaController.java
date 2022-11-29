package com.trabalho_individual.trabalho_individual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho_individual.trabalho_individual.logic.service.MusicaService;
import com.trabalho_individual.trabalho_individual.model.dto.MusicaRequest;
import com.trabalho_individual.trabalho_individual.model.entity.MusicaEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/music")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @PostMapping("/new")
    public ResponseEntity<?> salvarNovaMusica(@RequestBody MusicaRequest request) {
        try {
            musicaService.salvarNovaMusica(request);
            return ResponseEntity.ok().body("Música salva com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> todasAsMusicas() {
        try {
            List<MusicaEntity> response = musicaService.carregarTodasMusicas();
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteMusic(@RequestParam("id") Long id) {
        try {
            musicaService.deleteMusic(id);
            return ResponseEntity.ok().body("Música apagada com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
