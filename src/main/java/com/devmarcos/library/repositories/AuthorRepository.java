package com.devmarcos.library.repositories;

import com.devmarcos.library.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
