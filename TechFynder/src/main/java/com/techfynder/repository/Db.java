package com.techfynder.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techfynder.models.Currency;

@Component
public class Db implements  CommandLineRunner {


    private TechfynderRepository techfynderRepository;

    public Db(TechfynderRepository techfynderRepository) {
        this.techfynderRepository = techfynderRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Currency p1 = new Currency(

                "srilanka",
                " LKR",
                1,145
        );
        Currency p2 = new Currency(

                "india",
                "INR",
                1,74
        );
        // drop all database first
        this.techfynderRepository.deleteAll();

        // save all the specified product
        List<Currency> currencies = Arrays.asList(p1,p2);
        this.techfynderRepository.saveAll(currencies);
    }
}
