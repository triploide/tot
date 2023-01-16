package com.tot.api.controllers;

import com.tot.api.models.Entry;
import com.tot.api.repositories.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntryController {
    @Autowired
    private EntryRepository entryRepository;
    @RequestMapping(value = "entries")
    public List<Entry> index() {
        return entryRepository.findAll();
    }
}
