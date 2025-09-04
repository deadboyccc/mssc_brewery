package dev.dead.mssc_brewery.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dead.mssc_brewery.web.model.BeerDto;
import dev.dead.mssc_brewery.web.services.BeerService;
import dev.dead.mssc_brewery.web.services.BeerServiceImpl;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  private final BeerService beerService;

  BeerController(BeerServiceImpl beerService) {
    this.beerService = beerService;
  }

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
    return new ResponseEntity<>(
        beerService.getBearById(beerId), HttpStatus.OK);

  }

}
