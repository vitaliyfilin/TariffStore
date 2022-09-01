package com.example.cachetask.service;

import com.example.cachetask.model.Balance;
import com.example.cachetask.repository.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceServiceImpl implements BalanceService{
    @Autowired
    BalanceRepository balanceRepository;
    @Override
    public List<Balance> listBalance() {
        return balanceRepository.findAll();
    }

    @Override
    public void postBalance(Balance balance) {
        balanceRepository.save(balance);
    }

}
