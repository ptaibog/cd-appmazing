package com.campusdual.appmazing.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity //es un elemento persistible, que va a estar en una bbdd
@Table(name = "CONTACTS") //la tabla de la que va a provenir este objeto
public class Contact {

    @Id // indica esta es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // da un valor determinado por la estrategia identity
    private int id;
    @Column
    private String name;
    @Column
    private String firstsurname;
    @Column
    private String secondsurname;
    @Column
    private int phonenumber;
    @Column
    private String mail;

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

    public String getFirstsurname() {
        return firstsurname;
    }

    public void setFirstsurname(String firstsurname) {
        this.firstsurname = firstsurname;
    }

    public String getSecondsurname() {
        return secondsurname;
    }

    public void setSecondsurname(String secondsurname) {
        this.secondsurname = secondsurname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
