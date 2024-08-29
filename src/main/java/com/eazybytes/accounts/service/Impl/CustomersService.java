package com.eazybytes.accounts.service.Impl;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.service.ICustomersService;
import org.springframework.stereotype.Service;

@Service
public class CustomersService implements ICustomersService {

    private CustomerRepository customerRepo;
    private AccountsRepository accountsMapper;
    @Override
    public void createCustomer(CustomerDto customerDto) {

    }
}
