package com.khadri.spring.core;

public class Student {

    private Address address;

    Student(){
        System.out.println("Student Constructor executed");
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
