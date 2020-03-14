package com.example.guice;

import com.example.common.AccountService;
import com.google.inject.Inject;

public class GuiceUserService {

    @Inject
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

}