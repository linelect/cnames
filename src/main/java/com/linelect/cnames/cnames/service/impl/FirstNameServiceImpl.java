package com.linelect.cnames.cnames.service.impl;

import com.linelect.cnames.cnames.model.FirstName;
import com.linelect.cnames.cnames.repository.FirstNameRepository;
import com.linelect.cnames.cnames.service.FirstNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FirstNameServiceImpl implements FirstNameService {

    private final FirstNameRepository firstNameRepository;

    @Autowired
    public FirstNameServiceImpl(FirstNameRepository firstNameRepository) {
        this.firstNameRepository = firstNameRepository;
    }

    @Override
    public FirstName save(FirstName firstName) {
        return firstNameRepository.save(firstName);
    }

    @Override
    public List<FirstName> saveAll(List<FirstName> firstNames) {
        return firstNameRepository.saveAll(firstNames);
    }

    @Override
    public FirstName getById(long id) {
        return firstNameRepository.getOne(id);
    }

    @Override
    public List<FirstName> getByIds(List<Long> ids) {
        return firstNameRepository.findAllById(ids);
    }

    @Override
    public List<FirstName> getAll() {
        return firstNameRepository.findAll();
    }
}
