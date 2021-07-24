package com.example.service.user.userservice;

public class Contact {

  private int id;
  private int userId;
  private String email;
  private String phone;

  public Contact(int id, int userId, String email, String phone) {
    this.id = id;
    this.userId = userId;
    this.email = email;
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
