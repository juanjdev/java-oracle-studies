package com.uptc.frw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DETALLES_COMPRA")
public class ShoppingDetail {
    @Id
    @Column(name = "ID_DETALLE")
    private Long id_detail;
    @Column(name = "ID_COMPRA")
    private Long id_shopping;
    @Column(name = "ID_LIBRO")
    private Long id_book;
    @Column(name = "CANTIDAD")
    private Long amount;

    public ShoppingDetail(){

    }

    public Long getId_detail() {
        return id_detail;
    }

    public void setId_detail(Long id_detail) {
        this.id_detail = id_detail;
    }

    public Long getId_shopping() {
        return id_shopping;
    }

    public void setId_shopping(Long id_shopping) {
        this.id_shopping = id_shopping;
    }

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}

