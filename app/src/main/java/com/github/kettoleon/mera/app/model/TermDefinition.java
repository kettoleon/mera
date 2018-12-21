package com.github.kettoleon.mera.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TermDefinition {
    private Locale locale;
    private String word;
    private String pos;
    private List<Sense> senses = new ArrayList<Sense>();

    /**
     * @deprecated Only added this as a workaround for the MagicEnglish dictionary provider
     * Ideally providers should use their own model to persist data and translate to the application one.
     */
    @Deprecated
    public TermDefinition(){

    }

    public TermDefinition(Locale locale, String pos, String word) {
        this.locale = locale;
        this.word = word;
        this.pos = pos;
    }

    public String getWord() {
        return word;
    }

    public String getPos() {
        return pos;
    }

    public Locale getLocale() {
        return locale;
    }


    @Deprecated
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Deprecated
    public void setWord(String word) {
        this.word = word;
    }

    @Deprecated
    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "TermDefinition{" +
                "word='" + word + '\'' +
                ", pos='" + pos + '\'' +
                ", senses=" + senses +
                '}';
    }

    public List<Sense> getSenses() {
        return senses;
    }

    public void setSenses(List<Sense> senses) {
        this.senses = senses;
    }
}
