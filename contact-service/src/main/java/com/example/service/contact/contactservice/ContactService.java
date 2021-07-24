package com.example.service.contact.contactservice;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

  private List<Contact> contacts = Arrays.asList(
          new Contact(1, 1, "first.user@mail.com", "1111111111"),
          new Contact(2, 2, "second.user@mail.com", "2222222222"),
          new Contact(3, 3, "third.user@mail.com", "3333333333")
  );

  public List<Contact> getContactsForUser(int userId) {
    return this.contacts.stream().filter(c -> c.getUserId() == userId).collect(Collectors.toList());
  }

}
