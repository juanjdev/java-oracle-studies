package com.uptc.frw.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PERSONAS")
public class Person {
    @Id
    @Column(name = "ID_PERSONA")
    private Long id_person;
    @Column(name = "NOMBRES")
    private String name;
    @Column(name = "APELLIDOS")
    private String last_name;
    @Column(name = "NACIONALIDAD")
    private String nacionality;

    @OneToMany(mappedBy = "person")
    private List<Shopping> shoppings;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;

    public Person (){

    }

    public Person(Long id_person, String name, String last_name, String nacionality) {
        this.id_person = id_person;
        this.name = name;
        this.last_name = last_name;
        this.nacionality = nacionality;
    }

    public Long getId_person() {
        return id_person;
    }

    public void setId_person(Long id_person) {
        this.id_person = id_person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public List<Shopping> getShoppings() {
        return shoppings;
    }

    public void setShoppings(List<Shopping> shoppings) {
        this.shoppings = shoppings;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
