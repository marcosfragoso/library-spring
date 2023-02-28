package com.devmarcos.library.services;

import com.devmarcos.library.entities.Author;
import com.devmarcos.library.entities.Category;
import com.devmarcos.library.repositories.AuthorRepository;
import com.devmarcos.library.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;
    public List<Author> finAll() {
        return repository.findAll();
    }

    public Author findById(Long id) {
        Optional<Author> obj = repository.findById(id);
        return obj.get();
    }
}
