package dev.dead.mssc_brewery.web.controller.v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.dead.mssc_brewery.web.model.BeerDto;
import dev.dead.mssc_brewery.web.model.v2.BeerDtoV2;
import dev.dead.mssc_brewery.web.services.v2.BeerServiceV2;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

  private final BeerServiceV2 beerServiceV2;

  BeerControllerV2(BeerServiceV2 beerServiceV2) {
    this.beerServiceV2 = beerServiceV2;
  }

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {
    return new ResponseEntity<>(
        beerServiceV2.getBearById(beerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<BeerDtoV2> createBear(@RequestBody BeerDtoV2 beerDto) {
    BeerDtoV2 createdBeer = beerServiceV2.createBeer(beerDto);
    HttpHeaders httpHeaders = new HttpHeaders();
    // TODO add hostname full url
    httpHeaders.add("Location", "api/v1/beer/" + createdBeer.getId().toString());
    return new ResponseEntity<>(
        httpHeaders, HttpStatus.CREATED);
  }

  @PutMapping("/{beerId}")
  public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDtoV2 beerDto) {
    beerServiceV2.updateBeer(beerId, beerDto);
    return new ResponseEntity<>(
        HttpStatus.NO_CONTENT);

  }

  @DeleteMapping("{beerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteBeer(@PathVariable("beerId") UUID beerId) {
    beerServiceV2.deleteBeerById(beerId);
  }

}
