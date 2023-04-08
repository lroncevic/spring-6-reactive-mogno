package com.lukaroncevic.reactivemongo.mappers;

import com.lukaroncevic.reactivemongo.domain.Customer;
import com.lukaroncevic.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
