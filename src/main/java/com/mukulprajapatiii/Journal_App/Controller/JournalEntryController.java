package com.mukulprajapatiii.Journal_App.Controller;

import com.mukulprajapatiii.Journal_App.Entity.JournalEntry;
import com.mukulprajapatiii.Journal_App.Service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myentry) {

        journalEntryService.saveEntry(myentry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable long myId) {
        return journalEntryService.findById(String.valueOf(myId)).orElse(null);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable long myId) {
        return journalEntryService.deletebyId(String.valueOf(myId));
    }

    @PutMapping
    public JournalEntry updateEntryById(@PathVariable long myId, @RequestBody JournalEntry newentry) {
        JournalEntry old = journalEntryService.findById(String.valueOf(myId)).orElse(null);
        if (old != null) {
            old.setTitle(newentry.getTitle() != null && !newentry.getTitle().equals("") ? newentry.getTitle() : old.getTitle());
            old.setContent(newentry.getContent() != null && !newentry.getContent().equals("") ? newentry.getContent() : old.getContent());

        }

        journalEntryService.saveEntry(old);
        return null;
    }
}
