package com.github.kettoleon.mera.service.config;

import com.github.kettoleon.mera.app.services.SearchService;
import com.github.kettoleon.mera.service.adapters.WordNetEnglishDictionary;
import com.github.kettoleon.mera.service.adapters.MagicEnglishDictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.Arrays.asList;

@Configuration
public class MeraServiceConfiguration {

    @Bean
    public SearchService searchService() {
        return new SearchService(asList(new MagicEnglishDictionary(), new WordNetEnglishDictionary()));
    }

}
