package com.devmarcos.library.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "tb_loan")
public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book books;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
    private String dateLoan;
    private String dateReturn;

    public Loan() {}

    public Loan(Long id, Book book, User user, String dateLoan, String dateReturn) {
        this.id = id;
        this.books = book;
        this.client = user;
        this.dateLoan = dateLoan;
        this.dateReturn = dateReturn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return books;
    }

    public void setBook(Book book) {
        this.books = book;
    }

    public User getUser() {
        return client;
    }

    public void setUser(User user) {
        this.client = user;
    }

    public String getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(String dateLoan) {
        this.dateLoan = dateLoan;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan loan)) return false;
        return id.equals(loan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
