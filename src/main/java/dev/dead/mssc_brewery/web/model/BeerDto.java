package dev.dead.mssc_brewery.web.model;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
  @Null
  private UUID id;
  @NotBlank
  private String beerName;
  @NotBlank
  private String beerStyle;
  @Positive
  private long upc;

}
