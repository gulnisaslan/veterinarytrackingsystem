package com.veterinarytrackingsystem.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="animal_owners")
public class AnimalOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @NotNull(message = "İsim boş bırakılamaz.")
    @Column(name="first_name")
    private String firstName;

    @NotNull(message = "Soyad boş bırakılamaz.")
    @Column(name="last_name")
    private String lastName;

    @NotNull(message = "İletişim bilgieri kısmı boş bırakılamaz.")
    @Column(name="contact_information")
    private String contactInformation;

    @NotNull(message = "Telefon numarsını giriniz")
    @Column(name="phone_number")
    private String phoneNumber;

    @NotNull(message = "Email kısmı boş bırakılmaz.")
    @Column(name="email")
    @Email
    private String email;

    public AnimalOwner() {
    }

    public AnimalOwner(Integer id, String firstName, String lastName,
                       String contactInformation, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInformation = contactInformation;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}