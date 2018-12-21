package com.github.kettoleon.mera.service.model;

import com.github.kettoleon.mera.app.model.TermDefinition;

import java.util.HashMap;
import java.util.List;

public class DictionaryFormat {

    private HashMap<String, List<TermDefinition>> entries = new HashMap<>();

    public HashMap<String, List<TermDefinition>> getEntries() {
        return entries;
    }

    public void setEntries(HashMap<String, List<TermDefinition>> entries) {
        this.entries = entries;
    }
}
