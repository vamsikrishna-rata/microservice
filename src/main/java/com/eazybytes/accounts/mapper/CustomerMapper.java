package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {
    public Customer mapToCustomer(CustomerDto customerDto){
        return new Customer(customerDto.getName(),
                customerDto.getEmail(),
                customerDto.getMobileNumber());
    }
    public CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto(customer.getName(),
                customer.getEmail(),
                customer.getMobileNumber());

    }
}
