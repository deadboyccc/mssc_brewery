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

  @Override
  public BeerDto createBeer(BeerDto beerDto) {
    return BeerDto
        .builder()
        .id(beerDto.getId())
        .beerName(beerDto.getBeerName())
        .beerStyle(beerDto.getBeerStyle())
        .upc(beerDto.getUpc())
        .build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {

  }
}
