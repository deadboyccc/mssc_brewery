package dev.dead.mssc_brewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.dead.mssc_brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto.builder()
        .customerId(customerId).customerName("Tim")
        .build();
  }

  @Override
  public CustomerDto createCustomer(CustomerDto customerDto) {
    return CustomerDto.builder()
        .customerId(UUID.randomUUID())
        .customerName(customerDto.getCustomerName())
        .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    // TODO Auto-generated method stub
    log.debug("updating a customer!");
  }

  @Override
  public void deleteCustomer(UUID customerId) {
    // TODO Auto-generated method stub
    log.debug("deleting a customer");
  }

}
