package com.devmarcos.library.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "tb_book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ano;

    @ManyToMany
    @JoinTable(name = "tb_book_categories",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "tb_book_companies",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "publishingCompany_id"))
    private Set<PublishingCompany> publishingCompanies = new HashSet<>();
    @ManyToMany
    @JoinTable(name = "tb_book_authors",
    joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "books")
    private List<Loan> loans = new ArrayList<>();

    public Book (){}

    public Book(Long id, String title, String year) {
        this.id = id;
        this.title = title;
        this.ano = year;

    }

    public List<Loan> getLoans() {
        return loans;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public Set<PublishingCompany> getPublishingCompanies() {
        return publishingCompanies;
    }

    public Set<Category> getCategories() {
        return categories;
    }


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return ano;
    }

    public void setYear(String year) {
        this.ano = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
