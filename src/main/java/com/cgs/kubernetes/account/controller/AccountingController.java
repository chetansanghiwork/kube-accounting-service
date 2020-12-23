package com.cgs.kubernetes.account.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cgs.kubernetes.account.model.AccountValidationResponse;

@RestController
public class AccountingController {

	@GetMapping("/account/validate")
	public AccountValidationResponse validateUser(
			@RequestParam(required=true) String username,
			@RequestParam(required=true) String account) {
		
		AccountValidationResponse response = new AccountValidationResponse();
		response.setStatus("success");
		response.setUser(username);
		response.setAccount(account);
		return response;
	}
	
}
