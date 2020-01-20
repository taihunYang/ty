package com.qpq.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qpq.sb.domain.AccountVO;
import com.qpq.sb.persistence.AccountRepositoryI;

@Service
public class AccountImpl implements AccountServiceI{

	@Autowired
	private AccountRepositoryI accountRepo;

	@Override
	public void insertAccount(AccountVO account) {
		accountRepo.save(account);
		
	}
	
	
}
