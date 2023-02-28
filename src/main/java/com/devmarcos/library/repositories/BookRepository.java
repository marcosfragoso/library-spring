package com.devmarcos.library.repositories;

import com.devmarcos.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
