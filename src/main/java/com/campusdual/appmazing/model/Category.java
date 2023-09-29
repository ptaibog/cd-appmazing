package com.campusdual.appmazing.model;


import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
public class Category {

    @Id // indica esta es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int id;
    @Column
    private String name;

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
}
