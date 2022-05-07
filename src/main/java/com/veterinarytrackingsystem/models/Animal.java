package com.veterinarytrackingsystem.models;




import javax.persistence.*;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;




import java.util.List;

/**
 * Animal
 */
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    


    @OneToOne()
    @JoinColumn(name="animal_owner_id",referencedColumnName ="id" )
    private AnimalOwner animalOwner;

//    @Column(name="animal_kind_id")
//    private  Integer animalKindId;

    @OneToOne
   @JoinColumn(name = "animal_kind_id",referencedColumnName = "id")
   private AnimalKind animalKind;


   @OneToOne
   @JoinColumn(name="animal_gender_id",referencedColumnName = "id")
   private AnimalGender animalGender;



   @NotNull(message = "İsim boş bırakılamaz.")
   @Column(name="name")
   private String name;

   @NotNull(message = "Yaş boş bırakılamaz.")
   @Column(name="age")
   private Integer age;

   @NotNull(message = "Detay kısmı boş bırakılamaz.")
   @Column(name="description")
   private String description;

    public Animal() {
    }

    public Animal(Integer id, AnimalOwner animalOwner, AnimalKind animalKind,
                  AnimalGender animalGender, String name, Integer age, String description) {
        this.id = id;
        this.animalOwner = animalOwner;
        this.animalKind = animalKind;
        this.animalGender = animalGender;
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnimalOwner getAnimalOwner() {
        return animalOwner;
    }

    public void setAnimalOwner(AnimalOwner animalOwner) {
        this.animalOwner = animalOwner;
    }

    public AnimalKind getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(AnimalKind animalKind) {
        this.animalKind = animalKind;
    }

    public AnimalGender getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(AnimalGender animalGender) {
        this.animalGender = animalGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}