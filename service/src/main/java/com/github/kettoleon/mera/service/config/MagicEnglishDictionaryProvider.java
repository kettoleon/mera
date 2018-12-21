package com.github.kettoleon.mera.service.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.kettoleon.mera.app.model.TermDefinition;
import com.github.kettoleon.mera.app.providers.ReadWriteDictionaryProvider;
import com.github.kettoleon.mera.service.model.DictionaryFormat;

import java.io.File;
import java.io.IOException;
import java.util.*;

class MagicEnglishDictionaryProvider implements ReadWriteDictionaryProvider {

    private static final Locale EN_MG = new Locale("en", "mg");
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private Map<String, List<TermDefinition>> entries = new HashMap<>();

    public MagicEnglishDictionaryProvider() {

        File dct_file = new File("en_mg.dct.json");

        try {
            entries = objectMapper.readValue(dct_file, DictionaryFormat.class).getEntries();
        } catch (IOException e) {
            throw new RuntimeException("Could not load file: " + dct_file.getAbsoluteFile().getAbsolutePath(), e);
        }
    }


    @Override
    public List<TermDefinition> find(String searchTerm) {
        List<TermDefinition> results = new ArrayList<>();

        List<TermDefinition> found = entries.get(searchTerm);
        if (found != null) {
            results.addAll(found);
        }
//        if("easy".equals(searchTerm)){
//            TermDefinition td = new TermDefinition(EN_MG,"translation", "chupeited");
//            results.add(td);
//        }
        return results;
    }
}
