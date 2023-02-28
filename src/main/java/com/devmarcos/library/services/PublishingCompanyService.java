package com.devmarcos.library.services;

import com.devmarcos.library.entities.Category;
import com.devmarcos.library.entities.PublishingCompany;
import com.devmarcos.library.repositories.CategoryRepository;
import com.devmarcos.library.repositories.PublishingCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublishingCompanyService {
    @Autowired
    private PublishingCompanyRepository repository;
    public List<PublishingCompany> finAll() {
        return repository.findAll();
    }

    public PublishingCompany findById(Long id) {
        Optional<PublishingCompany> obj = repository.findById(id);
        return obj.get();
    }
}
