package com.edigest.journal.App.controller;

import com.edigest.journal.App.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Working Fine
@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long,JournalEntry>  journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public String createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return "True";

    }

}
