package br.com.alura.gerador_de_frases.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record QuoteDTO(
        @JsonProperty("titulo") String titulo,
        @JsonProperty("frase") String frase,
        @JsonProperty("personagem") String personagem,
        @JsonProperty("poster") String poster
) {}