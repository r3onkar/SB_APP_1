package com.banking.service;


import com.banking.Dto.AccountDto;
import com.banking.entity.Account;

public interface AccountService {

	

	AccountDto accountCreated(AccountDto accountDto);

	AccountDto getAllAccounts();

	AccountDto getAccountById(long id);

	AccountDto saveAccount(AccountDto account);

	void deleteAccount(long id);

}
