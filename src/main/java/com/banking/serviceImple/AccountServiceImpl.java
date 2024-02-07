package com.banking.serviceImple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.Dto.AccountDto;
import com.banking.entity.Account;
import com.banking.mapper.AccountMapper;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;

@Service
public class AccountServiceImpl  implements AccountService {

	private static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	@Autowired
	AccountMapper amp;
	
	@Autowired
	private final AccountRepository accountRepository; 
	
  //constuctor base injection
//	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository){
	this.accountRepository =accountRepository;
	}

	@Override
	public AccountDto accountCreated(AccountDto accountDto) {

		Account account = amp.maptoAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return amp.maptoAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto getAccountById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto saveAccount(AccountDto account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(long id) {
		// TODO Auto-generated method stub
		
	}



}
