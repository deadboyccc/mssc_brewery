package dev.dead.mssc_brewery.web.model.v2;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class BeerDtoV2 {
  @Null
  private UUID id;
  @NotBlank
  private String beerName;
  @NotNull
  private BeerStyleEnum beerStyle;
  @Positive
  private long upc;

}
