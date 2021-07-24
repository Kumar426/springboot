package com.example.service.user.userservice;

import java.util.List;

public class User {

  private int id;
  private String firstName;
  private String lastName;
  private List<Contact> contacts;

  public User(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public User(int id, String firstName, String lastName, List<Contact> contacts) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.contacts = contacts;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
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

  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }
}
