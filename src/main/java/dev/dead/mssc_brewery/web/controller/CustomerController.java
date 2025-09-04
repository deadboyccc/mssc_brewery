package dev.dead.mssc_brewery.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.dead.mssc_brewery.web.model.CustomerDto;
import dev.dead.mssc_brewery.web.services.CustomerService;

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

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
  private CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
    return new ResponseEntity<>(

        customerService.getCustomerById(customerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {

    CustomerDto createdCustomer = customerService.createCustomer(customerDto);
    HttpHeaders headers = new HttpHeaders();
    headers.add("Location", "/api/v1/customer/" + createdCustomer.getCustomerId().toString());
    return new ResponseEntity<>(createdCustomer, headers, HttpStatus.CREATED);

  }

  @PutMapping("/{customerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto) {
    customerService.updateCustomer(customerId, customerDto);

  }

  @DeleteMapping("/{customerId}")

  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteCustomer(@PathVariable UUID customerId) {
    customerService.deleteCustomer(customerId);

  }
}
