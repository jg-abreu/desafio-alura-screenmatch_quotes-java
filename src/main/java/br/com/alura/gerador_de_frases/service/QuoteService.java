package br.com.alura.gerador_de_frases.service;

import br.com.alura.gerador_de_frases.dto.QuoteDTO;
import br.com.alura.gerador_de_frases.model.Quote;
import br.com.alura.gerador_de_frases.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    public QuoteRepository repository;

    public QuoteDTO getRandomQuote() {
        Quote quote = repository.findRandomQuote();

        if (quote == null) {
            return null;
        }
    return new QuoteDTO(
            quote.getTitle(),
            quote.getQuote(),
            quote.getCharacter(),
            quote.getPoster()
    );
    }
}
