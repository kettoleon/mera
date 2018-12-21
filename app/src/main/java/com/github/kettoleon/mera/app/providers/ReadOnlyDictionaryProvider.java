package com.github.kettoleon.mera.app.providers;

import com.github.kettoleon.mera.app.model.TermDefinition;

import java.util.List;

public interface ReadOnlyDictionaryProvider {

    List<TermDefinition> find(String searchTerm);

}
