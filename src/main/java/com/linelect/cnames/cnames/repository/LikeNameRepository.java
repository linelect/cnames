package com.linelect.cnames.cnames.repository;

import com.linelect.cnames.cnames.model.LikeName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeNameRepository extends JpaRepository<LikeName, Long> {
    List<LikeName> findAllByFirstName_Id(long firstNameId);
    List<LikeName> findAllByUser_Id(long userId);
    void removeByFirstName_Id(long firstNameId);
}
