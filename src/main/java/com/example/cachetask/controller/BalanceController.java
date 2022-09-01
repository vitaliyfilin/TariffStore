package com.example.cachetask.controller;

import com.example.cachetask.model.Balance;
import com.example.cachetask.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {
    @Autowired
    BalanceService balanceService;

    @GetMapping("/getBalance")
    public List<Balance> getBalance() {
        return balanceService.listBalance();
    }
    @PostMapping("/postBalance")
    public void postBalance (int value) {
        Balance balance = new Balance();
        balance.setValue(value);
        balanceService.postBalance(balance);
    }
}
