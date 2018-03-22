package com.linelect.cnames.cnames.service;

import com.linelect.cnames.cnames.model.LikeName;

import java.util.List;

public interface LikeNameService {
    LikeName save(LikeName likeName);
    List<LikeName> getByUserId(long userId);
    void removeByFirstNameId(long firstNameId);
}
