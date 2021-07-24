package com.example.service.user.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  private List<User> users = Arrays.asList(
          new User(1, "First", "User"),
          new User(2, "Second", "User"),
          new User(3, "Third", "User")
  );

  @Autowired
  private RestTemplate restTemplate;

  public User getUser(int userId) throws Exception {
    Optional<User> userOptional = users.stream().filter(u -> u.getId() == userId).findFirst();
    if (userOptional.isPresent()) {
      List<Contact> contacts = restTemplate.getForObject("http://contact-service/contact/user/" + userId, List.class);
      userOptional.get().setContacts(contacts);
      return userOptional.get();
    } else {
      throw new Exception("User Not Found");
    }
  }
}
