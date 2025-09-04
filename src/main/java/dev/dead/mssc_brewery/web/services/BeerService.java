package dev.dead.mssc_brewery.web.services;

import java.util.UUID;

import dev.dead.mssc_brewery.web.model.BeerDto;

public interface BeerService {
  BeerDto getBearById(UUID beerId);

  BeerDto createBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);

  void deleteBeerById(UUID beerId);

}
