package br.com.alura.gerador_de_frases.repository;

import br.com.alura.gerador_de_frases.model.Quote;
import org.springframework.data.jpa.repository.Query;

public interface QuoteRepository {

    @Query(value = "SELECT * FROM quotes ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Quote findRandomQuote();
}
