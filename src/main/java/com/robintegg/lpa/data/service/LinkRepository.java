package com.robintegg.lpa.data.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robintegg.lpa.data.entity.Link;

public interface LinkRepository extends JpaRepository<Link,Long> {

    List<Link> findAllByOrderByCreatedDate();
    
}
