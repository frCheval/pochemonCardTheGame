package com.config;

import com.repository.CardRepository;
import com.repository.StoreOrderRepository;
import com.repository.StoreTransactionRepository;
import com.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    private UserRepository userRepository;
    private CardRepository cardRepository;
    private StoreOrderRepository storeOrderRepository;
    private StoreTransactionRepository storeTransactionRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
