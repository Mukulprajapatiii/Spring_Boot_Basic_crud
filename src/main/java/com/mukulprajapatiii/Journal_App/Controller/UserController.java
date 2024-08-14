package com.mukulprajapatiii.Journal_App.Controller;

import com.mukulprajapatiii.Journal_App.Entity.JournalEntry;
import com.mukulprajapatiii.Journal_App.Entity.User;
import com.mukulprajapatiii.Journal_App.Service.JournalEntryService;
import com.mukulprajapatiii.Journal_App.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //@GetMapping
    //public List<User> getAllUsers() {
      //  return userService.getAll();
    //}

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveEntry(user);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        User userinDb = userService.findByUsername(user.getUsername());
        if (userinDb != null) {
            userinDb.setUsername(user.getUsername());
            userinDb.setPassword(user.getPassword());
            userService.saveEntry(userinDb);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }






}
