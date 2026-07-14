package com.company.journalApp.controller;

import com.company.journalApp.entity.JournalEntry;
import com.company.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId){
        journalEntryService.getById(myId).orElse(null);
        return null;
    }
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry ) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveMyEntry(myEntry);
        return myEntry;
    }
}