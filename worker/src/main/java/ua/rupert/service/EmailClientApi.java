package ua.rupert.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmailClientApi {

    public void sendEmail(String destinationEmail,
                          String message) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info("Sending email to {} and message {}", destinationEmail, message);
    }
}
