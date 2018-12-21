package com.github.kettoleon.mera.app.services;

import com.github.kettoleon.mera.app.model.TermDefinition;
import com.github.kettoleon.mera.app.providers.ReadOnlyDictionaryProvider;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    private List<ReadOnlyDictionaryProvider> dictionaries;

    public SearchService(List<ReadOnlyDictionaryProvider> dictionaries) {
        this.dictionaries = dictionaries;
    }

    //TODO idea on how this should work:
    // if user tries to find "easy", return english definition with a "magic english: chupeited" link
    // if user tries to find "chupeited", return magic english definition, with a "english: easy" link
    // magic english definitions should be stored in a separate dictionary
    // magic english dictionary should return a link to "chupeited" when asked for "easy", and "chupeited" definition when asked for "chupeited".
    // so it is important that magic english dictionary runs before english one. (we should avoid that)

    public List<TermDefinition> search(String searchTerm) {
        List<TermDefinition> aggregatedResults = new ArrayList<>();

        for (ReadOnlyDictionaryProvider dictionary : dictionaries) {
            aggregatedResults.addAll(dictionary.find(searchTerm));
        }

        return aggregatedResults;
    }
}
