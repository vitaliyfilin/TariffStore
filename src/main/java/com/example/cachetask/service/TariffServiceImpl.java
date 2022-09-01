package com.example.cachetask.service;

import com.example.cachetask.model.Tariff;
import com.example.cachetask.repository.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffServiceImpl implements TariffService{
    @Autowired
    TariffRepository tariffRepository;
    @Override
    public void postTariff(Tariff tariff) {
        tariffRepository.save(tariff);
    }

    @Override
    public List<Tariff> listTariffs() {
        return tariffRepository.findAll();
    }
}
