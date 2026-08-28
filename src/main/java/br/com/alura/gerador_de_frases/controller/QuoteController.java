package br.com.alura.gerador_de_frases.controller;

import br.com.alura.gerador_de_frases.dto.QuoteDTO;
import br.com.alura.gerador_de_frases.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
@CrossOrigin
public class QuoteController {

    @Autowired
    public QuoteService service;

    @GetMapping("/frases")
    public QuoteDTO getRandomQuote() {
        return service.getRandomQuote();
    }
}
