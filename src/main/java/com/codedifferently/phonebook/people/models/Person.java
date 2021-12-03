package com.codedifferently.phonebook.people.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    //why generate override methods?
    //create attributes, constructors, get/setters


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //Would merge allow all numbers to be connect to one person or allow two people to have the same number??
    @OneToMany(cascade = CascadeType.MERGE)
    private List<PhoneNumber> phoneNumbers;

    //need default constructor
    public Person(){

    }

    //person object with attributes
    public Person(String name, List<PhoneNumber> phoneNumbers){
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    //still need get/set for auto-gen ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
