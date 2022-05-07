package com.veterinarytrackingsystem.models;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="animal_genders")
public class AnimalGender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @NotNull(message = "Cinsiyet alanını doldurunuz")
    @Column(name = "gender")
    private String gender;

    public AnimalGender (){

    }

    public AnimalGender(Integer id, String gender) {
        this.id = id;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
