package com.uptc.frw.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LIBROS")
public class Book {
    @Id
    @Column(name = "ID_LIBRO")
    private Long id;
    @Column(name = "TITULO")
    private String title;
    @Column(name = "PRECIO")
    private Double price;

    @OneToOne(mappedBy = "book")
    private Edition editions;

    @ManyToMany
    @JoinTable(name="autor_libro", joinColumns = @JoinColumn(name="id_libro"), inverseJoinColumns = @JoinColumn(name="id_autor"))
    private List<Person> authors;

    public Book() {

    }
    public Book(Long id, String title, Double price) {
        this.id = id;
        this.title = title;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Edition getEditions() {
        return editions;
    }

    public void setEditions(Edition editions) {
        this.editions = editions;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
