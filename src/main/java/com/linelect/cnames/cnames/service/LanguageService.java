package com.linelect.cnames.cnames.service;

import com.linelect.cnames.cnames.model.Language;

import java.util.List;

public interface LanguageService {

    Language save(Language language);
    List<Language> saveAll(List<Language> languages);
    Language getById(long id);
    List<Language> getAll();

}
