package dev.dead.mssc_brewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.dead.mssc_brewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto.builder()
        .customerId(customerId).customerName("Tim")
        .build();
  }

}
