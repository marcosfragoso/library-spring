package com.devmarcos.library.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "tb_publishing_company")
public class PublishingCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String contact;
    @JsonIgnore
    @ManyToMany(mappedBy = "publishingCompanies")
    private Set<Book> books = new HashSet<>();


    public PublishingCompany() {}

    public PublishingCompany(Long id, String nome, String endereco, String fixo) {
        this.id = id;
        this.name = nome;
        this.address = endereco;
        this.contact = fixo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEndereco() {
        return address;
    }

    public void setEndereco(String endereco) {
        this.address = endereco;
    }

    public String getFixo() {
        return contact;
    }

    public void setFixo(String fixo) {
        this.contact = fixo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublishingCompany that)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
