package com.smart.saver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.saver.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepo extends JpaRepository<User, Long> {




}

