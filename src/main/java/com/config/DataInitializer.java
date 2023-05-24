package com.config;

import com.entity.User;
import com.repository.CardRepository;
import com.repository.StoreOrderRepository;
import com.repository.StoreTransactionRepository;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final CardRepository cardRepository;
    private final StoreOrderRepository storeOrderRepository;
    private final StoreTransactionRepository storeTransactionRepository;

    public DataInitializer(UserRepository userRepository, CardRepository cardRepository, StoreOrderRepository storeOrderRepository, StoreTransactionRepository storeTransactionRepository) {
        this.userRepository = userRepository;
        this.cardRepository = cardRepository;
        this.storeOrderRepository = storeOrderRepository;
        this.storeTransactionRepository = storeTransactionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("test@gmail.com");
        user.setFirstName("Michel");
        user.setLastName("Dupont");
        userRepository.save(user);
    }
}
