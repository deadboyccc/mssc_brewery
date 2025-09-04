package dev.dead.mssc_brewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.dead.mssc_brewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

  @Override
  public BeerDto getBearById(UUID beerId) {
    return BeerDto
        .builder()
        .id(beerId)
        .beerName("Galaxy Cat")
        .beerStyle("Pale Ale")
        .build();
  }

}
