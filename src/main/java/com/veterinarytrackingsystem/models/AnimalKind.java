package com.veterinarytrackingsystem.models;


import javax.persistence.*;

import javax.validation.constraints.NotEmpty;





@Entity
@Table(name="animal_kinds")
public class AnimalKind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private Integer id;


    @Column(name = "kind")
    @NotEmpty(message = "Boş olamaz.")
    private String kind;



    public AnimalKind() {
    }

    public AnimalKind(Integer id, String kind) {
        this.id = id;
        this.kind = kind;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}