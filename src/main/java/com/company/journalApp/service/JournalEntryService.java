package com.company.journalApp.service;

import com.company.journalApp.entity.JournalEntry;
import com.company.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class  JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;
    public void saveMyEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }
    public void deleteById(ObjectId objectId){
        journalEntryRepository.deleteById(objectId);
    }
    public void deleteAll(){
        journalEntryRepository.deleteAll();
    }
}
