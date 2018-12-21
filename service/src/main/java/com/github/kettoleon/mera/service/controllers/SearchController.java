package com.github.kettoleon.mera.service.controllers;

import com.github.kettoleon.mera.app.model.TermDefinition;
import com.github.kettoleon.mera.app.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/api/v1/search/{term}")
    public List<TermDefinition> searchTerm(@PathVariable("term") String term) {
        return searchService.search(term);
    }

}
