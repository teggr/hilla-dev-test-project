package com.robintegg.lpa.endpoints.frontpage;

import java.time.Instant;
import java.util.List;

import com.robintegg.lpa.data.entity.Link;
import com.robintegg.lpa.data.service.LinkService;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import dev.hilla.Endpoint;

@Endpoint
@AnonymousAllowed
public class FrontpageEndpoint {

  private final LinkService linkService;

  public FrontpageEndpoint(LinkService linkService) {
    this.linkService = linkService;
  }
    
    public List<Link> getLinks() {
        return linkService.getLinksByCreatedOrder();
    }

}
