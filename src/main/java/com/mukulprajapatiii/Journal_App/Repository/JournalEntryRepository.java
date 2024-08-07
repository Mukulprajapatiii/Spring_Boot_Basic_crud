package com.mukulprajapatiii.Journal_App.Repository;

import com.mukulprajapatiii.Journal_App.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
