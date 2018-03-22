package com.linelect.cnames.cnames.service.impl;

import com.linelect.cnames.cnames.model.LikeName;
import com.linelect.cnames.cnames.repository.LikeNameRepository;
import com.linelect.cnames.cnames.service.LikeNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeNameServiceImpl implements LikeNameService {

    private final LikeNameRepository likeNameRepository;

    @Autowired
    public LikeNameServiceImpl(LikeNameRepository likeNameRepository) {
        this.likeNameRepository = likeNameRepository;
    }

    @Override
    public LikeName save(LikeName likeName) {
        return likeNameRepository.save(likeName);
    }

    @Override
    public List<LikeName> getByUserId(long userId) {
        return likeNameRepository.findAllByUser_Id(userId);
    }

    @Override
    public void removeByFirstNameId(long firstNameId) {
        likeNameRepository.removeByFirstName_Id(firstNameId);
    }
}
