package com.devmarcos.library.services;

import com.devmarcos.library.entities.Loan;
import com.devmarcos.library.entities.User;
import com.devmarcos.library.repositories.LoanRepository;
import com.devmarcos.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    @Autowired
    private LoanRepository repository;
    public List<Loan> finAll() {
        return repository.findAll();
    }

    public Loan findById(Long id) {
        Optional<Loan> obj = repository.findById(id);
        return obj.get();
    }
}
