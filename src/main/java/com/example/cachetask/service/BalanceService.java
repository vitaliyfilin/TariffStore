package com.example.cachetask.service;

import com.example.cachetask.model.Balance;

import java.util.List;

public interface BalanceService {
    public List<Balance> listBalance ();

    public void postBalance (Balance balance);
}
