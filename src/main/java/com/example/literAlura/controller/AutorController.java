package com.example.literAlura.controller;

import com.example.literAlura.model.Autor;
import com.example.literAlura.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor save(@RequestBody Autor autor) {
        return autorService.save(autor);
    }

    @GetMapping
    public List<Autor> findAll() {
        return autorService.findAll();
    }

    @GetMapping("/ano/{ano}")
    public List<Autor> findByAno(@PathVariable Integer ano) {
        return autorService.findByAno(ano);
    }
}
