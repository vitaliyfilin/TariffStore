package com.example.cachetask.service;

import com.example.cachetask.model.Tariff;

import java.util.List;

public interface TariffService {
    public void postTariff (Tariff tariff);
    public List<Tariff> listTariffs();
}
