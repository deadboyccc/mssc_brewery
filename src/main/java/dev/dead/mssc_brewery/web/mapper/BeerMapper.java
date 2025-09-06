package dev.dead.mssc_brewery.web.mapper;

import org.mapstruct.Mapper;

import dev.dead.mssc_brewery.domain.Beer;
import dev.dead.mssc_brewery.web.model.BeerDto;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
  BeerDto beerToBeerDto(Beer beer);

  Beer beerDtoToBeer(BeerDto beerDto);

}
