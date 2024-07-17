package com.example.literAlura.service;

import com.example.literAlura.model.Livro;
import com.example.literAlura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public List<Livro> findByTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    }

    public List<Livro> findByIdioma(String idioma) {
        return livroRepository.findByIdioma(idioma);
    }
}
