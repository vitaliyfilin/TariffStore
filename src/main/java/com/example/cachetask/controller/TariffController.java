package com.example.cachetask.controller;

import com.example.cachetask.model.Tariff;
import com.example.cachetask.service.TariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TariffController {
    @Autowired
    TariffService tariffService;

    @PostMapping("/postTariff")
    public void postTariff(String name, int price) {
        Tariff tariff = new Tariff(name, price);
        tariffService.postTariff(tariff);
    }

    @GetMapping("/getTariffs")
    public List<Tariff> getTariffs() {
        return tariffService.listTariffs();
    }
}
