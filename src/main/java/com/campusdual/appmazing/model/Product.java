package com.campusdual.appmazing.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity //es un elemento persistible, que va a estar en una bbdd
@Table(name = "PRODUCTS") //la tabla de la que va a provenir este objeto
public class Product {

    @Id // indica esta es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // da un valor determinado por la estrategia identity
    private int id;
    @Column
    private String name;
    @Column
    private int stock;
    @Column
    private BigDecimal price;
    @Column
    private Boolean active;
    @Column
    private Date date_added;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }
}
