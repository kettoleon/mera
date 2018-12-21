package com.github.kettoleon.mera.app.model;

import java.util.ArrayList;
import java.util.List;

public class Sense {
    private List<String> words = new ArrayList<>();
    private String gloss;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void setGloss(String gloss) {
        this.gloss = gloss;
    }

    public String getGloss() {
        return gloss;
    }

    @Override
    public String toString() {
        return "Sense{" +
                "words=" + String.join(", ", words) +
                ", gloss='" + gloss + '\'' +
                '}';
    }
}
