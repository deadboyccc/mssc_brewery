package dev.dead.mssc_brewery.web.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.dead.mssc_brewery.web.model.v2.BeerDtoV2;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

  @Override
  public BeerDtoV2 getBearById(UUID beerId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBearById'");
  }

  @Override
  public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBeer'");
  }

  @Override
  public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateBeer'");
  }

  @Override
  public void deleteBeerById(UUID beerId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteBeerById'");
  }

}
