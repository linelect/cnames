package com.linelect.cnames.cnames.service;

import com.linelect.cnames.cnames.model.FirstName;
import com.linelect.cnames.cnames.repository.FirstNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FirstNameService {
    FirstName save(FirstName firstName);
    List<FirstName> saveAll(List<FirstName> firstNames);
    FirstName getById(long id);
    List<FirstName> getByIds(List<Long> ids);
    List<FirstName> getAll();
    FirstName getByName(String name);
}
