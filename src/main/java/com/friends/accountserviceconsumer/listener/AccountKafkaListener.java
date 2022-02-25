package com.friends.accountserviceconsumer.listener;

import com.friends.accountservice.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AccountKafkaListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountKafkaListener.class);

    private final String ACCOUNT_TOPIC = "account";

    @KafkaListener(topics = ACCOUNT_TOPIC)
    public void consumeAccount(Account account) {
        LOGGER.info("Account Obj : " + account);
    }
}
