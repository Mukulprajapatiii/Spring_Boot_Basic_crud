package com.mukulprajapatiii.Journal_App.Service;

import com.mukulprajapatiii.Journal_App.Entity.JournalEntry;
import com.mukulprajapatiii.Journal_App.Repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }
    public Optional<JournalEntry> findById(String id) {
        return journalEntryRepository.findById(id);
    }

    public JournalEntry deletebyId(String id) {
        journalEntryRepository.deleteById(id);
        return null;
    }

    public void deleteAll() {
        journalEntryRepository.deleteAll();
    }


}
