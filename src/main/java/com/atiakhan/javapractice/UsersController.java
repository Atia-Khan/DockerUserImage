package com.atiakhan.javapractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")

public class UsersController {

  @Autowired
  private IUserRepository user;

  public UsersController(IUserRepository user) {
    this.user = user;
  }

  @GetMapping("/list")
  public List<Users> getUsers() {
    return (List<Users>) this.user.findAll();
  }

  @PostMapping("")
  public String addUser(@RequestBody Users user) {
    this.user.save(user);
    return "New User " + user.getuName() + " has been Added";
  }

}
