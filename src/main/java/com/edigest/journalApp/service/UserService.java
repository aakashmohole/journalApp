package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.repositry.JournalEntryRepository;
import com.edigest.journalApp.repositry.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId myId){
        return userRepository.findById(myId);
    }

    public void deleteById(ObjectId myId){
        userRepository.deleteById(myId);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
