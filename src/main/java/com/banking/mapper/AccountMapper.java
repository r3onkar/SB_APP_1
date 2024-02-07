package com.banking.mapper;

import org.springframework.stereotype.Component;

import com.banking.Dto.AccountDto;
import com.banking.entity.Account;
@Component
public class AccountMapper {

	 
	
	public Account maptoAccount(AccountDto accountDto) {
		
		Account account = new Account();
		account.setId(accountDto.getId());
		account.setAccountHolderName(accountDto.getAccountHolderName());
		account.setBalance(accountDto.getBalance());
		
		return account;
	}
	
public AccountDto maptoAccountDto(Account account ) {
		
		AccountDto accountDto = new AccountDto();
		accountDto.setId(accountDto.getId());
		accountDto.setAccountHolderName(accountDto.getAccountHolderName());
		accountDto.setBalance(accountDto.getBalance());
		return accountDto;
	}
	

}
