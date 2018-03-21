package com.linelect.cnames.cnames.controller;

import com.linelect.cnames.cnames.model.FirstName;
import com.linelect.cnames.cnames.model.Language;
import com.linelect.cnames.cnames.repository.FirstNameRepository;
import com.linelect.cnames.cnames.repository.LanguageRepository;
import com.linelect.cnames.cnames.service.FirstNameService;
import com.linelect.cnames.cnames.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRest {

    @Autowired
    FirstNameService firstNameService;

    @Autowired
    LanguageService languageService;

    @RequestMapping("/")
    public List<FirstName> home() {
        FirstName firstName = new FirstName();
        firstName.setName("namename");
        firstName.setDescription("name entry desc");
        firstNameService.save(firstName);

        return firstNameService.getAll();
    }

    @RequestMapping("/name")
    public String homeName() {
        return "name rest ів3434";
    }

    @RequestMapping("/languages")
    public List<Language> languages() {
        Language language = new Language();
        language.setName("UA");
        languageService.save(language);

        return languageService.getAll();
    }

}