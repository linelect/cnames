package com.linelect.cnames.cnames.service.impl;

import com.linelect.cnames.cnames.model.FirstName;
import com.linelect.cnames.cnames.model.LikeName;
import com.linelect.cnames.cnames.model.User;
import com.linelect.cnames.cnames.repository.FirstNameRepository;
import com.linelect.cnames.cnames.repository.LikeNameRepository;
import com.linelect.cnames.cnames.service.FirstNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FirstNameServiceImpl implements FirstNameService {

    private final FirstNameRepository firstNameRepository;
    private final LikeNameRepository likeNameRepository;

    @Autowired
    public FirstNameServiceImpl(FirstNameRepository firstNameRepository, LikeNameRepository likeNameRepository) {
        this.firstNameRepository = firstNameRepository;
        this.likeNameRepository = likeNameRepository;
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

    @Override
    public FirstName getByName(String name) {
        return firstNameRepository.findByName(name);
    }

    @Override
    public Set<FirstName> getNamesIntersection(User user1, User user2) {
        Set<FirstName> setOfFirstNamesUser1 = likeNameRepository.findAllByUser_Id(user1.getId())
                .stream()
                .map(LikeName::getFirstName)
                .collect(Collectors.toSet());
        Set<FirstName> setOfFirstNamesUser2 = likeNameRepository.findAllByUser_Id(user2.getId())
                .stream()
                .map(LikeName::getFirstName)
                .collect(Collectors.toSet());

        return setOfFirstNamesUser1.stream()
                .filter(setOfFirstNamesUser2::contains)
                .collect(Collectors.toSet());
    }
}
