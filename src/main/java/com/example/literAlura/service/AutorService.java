package com.example.literAlura.service;

import com.example.literAlura.model.Autor;
import com.example.literAlura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public List<Autor> findByAno(Integer ano) {
        return autorRepository.findByAnoNascimentoLessThanEqualAndAnoFalecimentoGreaterThanEqual(ano, ano);
    }
}
