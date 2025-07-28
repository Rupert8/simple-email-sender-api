package ua.rupert.controller;

import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ua.rupert.service.EmailClientApi;
import ua.rupert.store.dao.SendEmailTaskDao;
import ua.rupert.store.entities.SendEmailTaskEntity;

@RequestMapping("/api/v1")
@RequiredArgsConstructor
@RestController
@Validated
public class EmailController {
    private final EmailClientApi emailClientApi;
    private final SendEmailTaskDao sendEmailTaskDao;

    private static final String SEND_EMAIL = "/email/send";

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(SEND_EMAIL)
    public void sendEmail(@RequestParam("destination_email") @NotBlank(message = "destination email doesn't can be empty") String destinationEmail,
                          @RequestParam @NotBlank(message = "message doesn't can be empty") String message) {

        sendEmailTaskDao.save(SendEmailTaskEntity.builder()
                        .destinationEmail(destinationEmail)
                        .message(message)
                        .build()
        );
    }
}
