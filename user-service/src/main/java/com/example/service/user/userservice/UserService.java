package com.example.service.user.userservice;

import org.springframework.stereotype.Service;

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

  public User getUser(int userId) throws Exception {
    Optional<User> user = users.stream().filter(u -> u.getId() == userId).findFirst();
    if (user.isPresent()) {
      return user.get();
    } else {
      throw new Exception("User Not Found");
    }
  }
}
