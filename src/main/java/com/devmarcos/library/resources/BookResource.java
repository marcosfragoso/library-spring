package com.devmarcos.library.resources;

import com.devmarcos.library.entities.Book;
import com.devmarcos.library.entities.Category;
import com.devmarcos.library.services.BookService;
import com.devmarcos.library.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
    @Autowired
    private BookService service;
    @GetMapping
    public ResponseEntity<List<Book>> findAll() {
        List<Book> list = service.finAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Book obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
