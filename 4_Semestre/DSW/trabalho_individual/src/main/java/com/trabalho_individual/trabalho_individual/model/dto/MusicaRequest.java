package com.trabalho_individual.trabalho_individual.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonPropertyOrder({"titulo", "artista", "ano_lancamento"})
public class MusicaRequest {
    
    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("artista")
    private String artista;

    @JsonProperty("ano_lancamento")
    private Integer anoLancamento;
}
