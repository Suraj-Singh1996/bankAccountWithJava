package com.account.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.Entity.Account;
import com.account.service.AccountService;

@RestController
public class AccountCountroller {

	
	@Autowired
	private AccountService accountService;
	
	//Add account by Post.
	
	@PostMapping("/addAccount")
	public Account createAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}
	
	@PostMapping("/addmultipalAccount")
	public Collection<Account> multiCreateAccount(@RequestBody List<Account> account) {
		return accountService.multipalAccount( account);
	}
	
	@GetMapping("/getAccount")
	public Collection<Account> findAllAccount() {
		
		return accountService.findAccountDetails();
	}
	
	@GetMapping("/getAccount/{id}")
	public Account getOneAccount(@PathVariable Integer id) {
		return accountService.getSingleAccount(id);
	}
	
	@PutMapping("updateAccount/{id}")
	public Account updateAccount(@RequestBody Account account,@PathVariable Integer id) {
		
		return accountService.updateMyAccount(account,id);
	}
	
	@DeleteMapping("removeAccount/{id}")
	public Account deleteAccount(@PathVariable int id) {
		
		return accountService.removeAccount(id);
	}
	
	

}
