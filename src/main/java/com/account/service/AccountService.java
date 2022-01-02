package com.account.service;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.account.Entity.Account;

@Service
public class AccountService {
	
	Map<Integer, Account> map = new HashMap<>();
	
	private Integer id=1;
	public Account addAccount(Account account) {
		account.setAccountId(this.id++);
		
		account.setAccountNumber(Calendar.getInstance().getTimeInMillis());
		return map.put(account.getAccountId(), account);
	}
	
	public Collection<Account> multipalAccount(Collection<Account> account) {
		
		for (Account acc : account) {
			acc.setAccountId(this.id++);
			acc.setAccountNumber(Calendar.getInstance().getTimeInMillis());
			this.map.put(acc.getAccountId(), acc);
		}
		return account;
	}
	
	
	public Collection<Account> findAccountDetails() {
		
		return map.values();
	}
	
	public Account getSingleAccount(Integer id) {
		
		return map.get(id);
	}
	
	public Account updateMyAccount(Account account,Integer id) {
		
		Account updatedValue =map.get(id);
		updatedValue.setAccountName(account.getAccountName());
		updatedValue.setAccountType(account.getAccountType());
		return map.put(id, updatedValue);
	}
	
	public Account removeAccount(int id) {
		
		return map.remove(id);
	}
}
