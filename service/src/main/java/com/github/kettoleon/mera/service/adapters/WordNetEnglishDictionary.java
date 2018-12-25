package com.github.kettoleon.mera.service.adapters;

import com.github.kettoleon.mera.app.model.Sense;
import com.github.kettoleon.mera.app.model.TermDefinition;
import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class WordNetEnglishDictionary implements com.github.kettoleon.mera.app.ports.EnglishDictionary {
    public List<TermDefinition> find(String searchTerm) {
        List<TermDefinition> results = new ArrayList<>();
        try {
            Dictionary d = Dictionary.getDefaultResourceInstance();

            translate(d.lookupAllIndexWords(searchTerm).getIndexWordCollection(), results);

        } catch (JWNLException e) {
            e.printStackTrace();
        }
        return results;
    }

    private void translate(Collection<IndexWord> indexWordCollection, List<TermDefinition> results) {

        for(IndexWord indexWord : indexWordCollection){
            TermDefinition termDefinition = new TermDefinition(Locale.ENGLISH, indexWord.getPOS().getLabel(), indexWord.getLemma());
            results.add(termDefinition);
            for(Synset synset : indexWord.getSenses()){
                Sense sense = new Sense();
                for(Word word : synset.getWords()){
                    sense.getWords().add(word.getLemma());
                }
                sense.setGloss(synset.getGloss());

                termDefinition.getSenses().add(sense);
            }


        }


    }
}
