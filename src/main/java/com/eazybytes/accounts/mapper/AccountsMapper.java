package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;

public class AccountsMapper {

    public static AccountsDto mapToAccountDto(Accounts account){
//        accountsDto.setAccountNumber(account.getAccountNumber());
        return new AccountsDto(
                account.getAccountNumber(),
                account.getAccountType(),
                account.getBranchAddress()
        );
    }
    public static Accounts mapToAccounts(AccountsDto accountsDto){
        return new Accounts(accountsDto.getAccountNumber(),
        accountsDto.getAccountType(),
        accountsDto.getBranchAddress());
    }

}


