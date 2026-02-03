package com.edigest.journalApp.repositry;
import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, ObjectId>{
    User findByUserName(String username);
}
