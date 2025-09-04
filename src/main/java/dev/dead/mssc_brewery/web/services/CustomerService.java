package dev.dead.mssc_brewery.web.services;

import java.util.UUID;

import dev.dead.mssc_brewery.web.model.CustomerDto;

public interface CustomerService {
  CustomerDto getCustomerById(UUID customerId);

}
