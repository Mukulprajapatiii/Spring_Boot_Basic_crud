package com.mukulprajapatiii.Journal_App.Repository;

import com.mukulprajapatiii.Journal_App.Entity.JournalEntry;
import com.mukulprajapatiii.Journal_App.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);

}
