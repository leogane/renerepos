package com.revature.dao;

import com.revature.model.BankAccount;
import com.revature.model.Users;

public interface BankUserDao {

	//Create
	
	//Read
	public Users getUserByUsername(Users user);
	public BankAccount getBankAccountByUserId(Users user);
	//Update
	
	//Delete
	
}
