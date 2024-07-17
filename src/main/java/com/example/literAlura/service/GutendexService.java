package com.example.literAlura.service;

import com.example.literAlura.model.Author;
import com.example.literAlura.model.GutendexBook;
import com.example.literAlura.model.GutendexResponse;
import com.example.literAlura.model.Livro;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {
    private final RestTemplate restTemplate = new RestTemplate();

    public Livro buscarLivroPorTitulo(String titulo) {
        String url = "https://gutendex.com/books?search=" + titulo;
        GutendexResponse response = restTemplate.getForObject(url, GutendexResponse.class);

        if (response != null && !response.getResults().isEmpty()) {
            GutendexBook gutendexBook = response.getResults().get(0);
            Livro livro = new Livro();
            livro.setTitulo(gutendexBook.getTitle());
            livro.setAutor(gutendexBook.getAuthors().isEmpty() ? "Unknown" : gutendexBook.getAuthors().get(0).getName());
            livro.setIdioma(gutendexBook.getLanguages().isEmpty() ? "Unknown" : gutendexBook.getLanguages().get(0));
            livro.setDownloads(gutendexBook.getDownloadCount());
            return livro;
        }

        return null;
    }
}



