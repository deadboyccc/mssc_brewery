package dev.dead.mssc_brewery.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dead.mssc_brewery.web.model.CustomerDto;
import dev.dead.mssc_brewery.web.services.CustomerService;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
  private CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getMethodName(@PathVariable("customerId") UUID customerId) {
    return new ResponseEntity<>(

        customerService.getCustomerById(customerId), HttpStatus.OK);
  }

}
