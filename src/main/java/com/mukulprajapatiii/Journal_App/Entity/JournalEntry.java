package com.mukulprajapatiii.Journal_App.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "journal_entriesV2")
@Data
public class JournalEntry {
    @Id
    private String id;
    private String title;
    private String content;
    private Date date;


}
