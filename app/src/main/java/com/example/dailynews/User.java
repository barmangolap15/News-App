package com.example.dailynews;

public class User {
    String firstname, lastname, email, contactno;

    public User() {
    }

    public User(String firstname, String lastname, String email, String contactno) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.contactno = contactno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }
}
