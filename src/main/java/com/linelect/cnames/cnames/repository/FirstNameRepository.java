package com.linelect.cnames.cnames.repository;

import com.linelect.cnames.cnames.model.FirstName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FirstNameRepository extends JpaRepository<FirstName, Long> {
//    @Override
//    <S extends FirstName> S saveAndFlush(S entity);
//
//    @Override
//    List<FirstName> findAll();
//
//    @Override
//    Page<FirstName> findAll(Pageable pageable);
}
