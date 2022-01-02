package com.account.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Account {
	
	private Integer accountId;
	private long accountNumber;
	private String accountName;
	private String accountType;
	

}
