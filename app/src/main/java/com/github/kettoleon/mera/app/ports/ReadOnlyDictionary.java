package com.github.kettoleon.mera.app.ports;

import com.github.kettoleon.mera.app.model.TermDefinition;

import java.util.List;

public interface ReadOnlyDictionary {

    List<TermDefinition> find(String searchTerm);

}
