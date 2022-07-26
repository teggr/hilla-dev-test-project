package com.robintegg.lpa.data.entity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    private final String url;
    private final Instant createdDate;

    public Link(Long id, String url, Instant createdDate) {
        this.id = id;
        this.url = url;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }
    
}
