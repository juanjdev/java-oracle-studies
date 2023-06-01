package com.uptc.frw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "EDICIONES")
public class Edition {
    @Id
    @Column(name = "ID_LIBRO")
    private Long id_book;
    @Column(name = "ANIO_PUBLICACION")
    private int publication_year;
    @Column(name = "NUMERO")
    private int number;
    @Column(name = "DESCRIPCION")
    private String description;

    @OneToOne
    @JoinColumn(name = "ID_LIBRO", nullable = false)
    private Book book;

    public Edition() {

    }

    public Edition(Long id_book, int publication_year, int number, String description, Book book) {
        this.id_book = id_book;
        this.publication_year = publication_year;
        this.number = number;
        this.description = description;
        this.book = book;
    }

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Edition{" +
                "id_book=" + id_book +
                ", publication_year=" + publication_year +
                ", number=" + number +
                ", description='" + description + '\'' +
                ", book=" + book +
                '}';
    }
}
