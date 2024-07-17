package com.example.literAlura.controller;

import com.example.literAlura.model.Livro;
import com.example.literAlura.service.GutendexService;
import com.example.literAlura.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @Autowired
    private GutendexService gutendexService;

    @PostMapping("/buscar")
    public Livro buscarLivroPorTitulo(@RequestParam String titulo) {
        Livro livro = gutendexService.buscarLivroPorTitulo(titulo);
        if (livro != null) {
            return livroService.save(livro);
        }
        return null; // ou retorne uma resposta adequada indicando que o livro não foi encontrado
    }

    @GetMapping
    public List<Livro> findAll() {
        return livroService.findAll();
    }

    @GetMapping("/titulo/{titulo}")
    public List<Livro> findByTitulo(@PathVariable String titulo) {
        return livroService.findByTitulo(titulo);
    }

    @GetMapping("/idioma/{idioma}")
    public List<Livro> findByIdioma(@PathVariable String idioma) {
        return livroService.findByIdioma(idioma);
    }
}
