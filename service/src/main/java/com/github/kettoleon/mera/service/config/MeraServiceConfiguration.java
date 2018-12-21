package com.github.kettoleon.mera.service.config;

import com.github.kettoleon.mera.app.services.SearchService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class MeraServiceConfiguration {

    @Bean
    public SearchService searchService() {
        return new SearchService(Arrays.asList(new MagicEnglishDictionaryProvider(), new EnglishDictionaryProvider()));
    }

}
