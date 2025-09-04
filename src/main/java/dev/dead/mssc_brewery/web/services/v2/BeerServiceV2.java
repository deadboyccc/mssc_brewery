package dev.dead.mssc_brewery.web.services.v2;

import java.util.UUID;

import dev.dead.mssc_brewery.web.model.v2.BeerDtoV2;

public interface BeerServiceV2 {

  BeerDtoV2 getBearById(UUID beerId);

  BeerDtoV2 createBeer(BeerDtoV2 beerDto);

  void updateBeer(UUID beerId, BeerDtoV2 beerDto);

  void deleteBeerById(UUID beerId);
}
