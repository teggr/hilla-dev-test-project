package com.robintegg.lpa.data.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robintegg.lpa.data.entity.Link;

@Service
@Transactional(readOnly = true)
public class LinkService {

    private final LinkRepository linkRepository;
    
    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> getLinksByCreatedOrder() {
        return linkRepository.findAllByOrderByCreatedDate();
    }
    
}
