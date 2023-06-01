package com.uptc.frw.entity;

import jakarta.persistence.*;
import oracle.sql.DATE;
import org.hibernate.annotations.Cache;

import java.util.Date;

@Entity
@Table(name = "COMPRAS")
public class Shopping {
    @Id
    @Column(name = "ID_COMPRA")
    private Long id_shopping;
    @Column(name = "ID_PERSONA", insertable = false, updatable = false)
    private  Long id_person;
    @Column(name = "FECHA")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "ID_PERSONA", nullable = false)
    private Person person;

    public Shopping (){

    }
    public Shopping(Long id_shopping, Date date, Person person) {
        this.id_shopping = id_shopping;
        this.date = date;
        this.person = person;
    }

    public Long getId_shopping() {
        return id_shopping;
    }

    public void setId_shopping(Long id_shopping) {
        this.id_shopping = id_shopping;
    }

    public Long getId_person() {
        return id_person;
    }

    public void setId_person(Long id_person) {
        this.id_person = id_person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
