package dev.dead.mssc_brewery.web.mapper;

import org.mapstruct.Mapper;

import dev.dead.mssc_brewery.domain.Customer;
import dev.dead.mssc_brewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {
  Customer customerDtoToCustomer(CustomerDto customerDto);

  CustomerDto CustomerToCustomerDto(CustomerDto customerDto);

}
