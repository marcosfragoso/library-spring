package com.devmarcos.library.resources;

import com.devmarcos.library.entities.Category;
import com.devmarcos.library.entities.PublishingCompany;
import com.devmarcos.library.services.CategoryService;
import com.devmarcos.library.services.PublishingCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/companies")
public class PublishingCompanyResource {
    @Autowired
    private PublishingCompanyService service;
    @GetMapping
    public ResponseEntity<List<PublishingCompany>> findAll() {
        List<PublishingCompany> list = service.finAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PublishingCompany> findById(@PathVariable Long id){
        PublishingCompany obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
