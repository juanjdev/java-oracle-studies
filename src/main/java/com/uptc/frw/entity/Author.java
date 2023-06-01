package com.uptc.frw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTOR_LIBRO")
public class Author {
    @Id
    @Column(name = "ID_AUTOR")
    private Long id_author;
    @Column(name = "ID_LIBRO")
    private Long id_book;

    public Author (){

    }
    public Long getId_author() {
        return id_author;
    }

    public void setId_author(Long id_author) {
        this.id_author = id_author;
    }

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }
}
