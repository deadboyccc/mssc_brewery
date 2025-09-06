package dev.dead.mssc_brewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import dev.dead.mssc_brewery.web.model.v2.BeerStyleEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {

  @Null
  private UUID id;
  @NotBlank
  private String beerName;
  @NotNull
  private BeerStyleEnum beerStyle;
  @Positive
  private long upc;

  private Timestamp createdAt;
  private Timestamp lastModifiedAt;
}