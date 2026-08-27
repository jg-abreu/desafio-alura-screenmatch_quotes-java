package br.com.alura.gerador_de_frases.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record QuoteDTO(
        @JsonIgnoreProperties("titulo") String title,
        @JsonIgnoreProperties("frase") String quote,
        @JsonIgnoreProperties("personagem") String character,
        @JsonIgnoreProperties("poster") String poster
) {
}
