package com.revature.service;

import com.revature.dao.BankUserDao;
import com.revature.dao.BankUserDaoImpl;
import com.revature.dto.BankUserDTO;
import com.revature.model.BankAccount;
import com.revature.model.Users;

public class AppService {
	
	public Users validateUser(Users user){
		
		BankUserDao dao = new BankUserDaoImpl();
		
		Users dbUser = dao.getUserByUsername(user);
		if(dbUser != null){
			if( dbUser.getUsername().equals(user.getUsername() )  
					&& dbUser.getPassword().equals(user.getPassword())){
				return dbUser;
			}
		}
		return null;
		
	}

	
	public BankUserDTO convertToBankUserDTO(Users user, BankAccount bankAccount){
		
		return new BankUserDTO(user.getId(),user.getUsername(),user.getFirstName(),user.getLastName(), bankAccount.getBaId(), bankAccount.getBaBalance());
		
	} 
	
	public BankAccount getBankAccountByUsername(Users user){
		return new BankUserDaoImpl().getBankAccountByUserId(user);	}
}
