package com.codedifferently.phonebook.people.models;

import javax.persistence.Entity;

@Entity
public class PhoneNumber {
    //why generate override methods?
    //what is the ID?!?!
    //create attributes, default constructor, get/setters

    private Integer number;

    private String typeOfNumber;


    public PhoneNumber(){

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(String typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number=" + number +
                ", typeOfNumber='" + typeOfNumber + '\'' +
                '}';
    }
}
