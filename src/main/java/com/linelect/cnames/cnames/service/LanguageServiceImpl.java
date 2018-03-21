package com.linelect.cnames.cnames.service;

import com.linelect.cnames.cnames.model.Language;
import com.linelect.cnames.cnames.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public Language save(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public List<Language> saveAll(List<Language> languages) {
        return languageRepository.saveAll(languages);
    }

    @Override
    public Language getById(long id) {
        return languageRepository.getOne(id);
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.findAll();
    }
}
