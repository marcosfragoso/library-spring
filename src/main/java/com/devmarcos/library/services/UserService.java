package com.devmarcos.library.services;

import com.devmarcos.library.entities.Book;
import com.devmarcos.library.entities.User;
import com.devmarcos.library.repositories.BookRepository;
import com.devmarcos.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> finAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
