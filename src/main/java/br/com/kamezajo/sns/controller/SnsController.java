package br.com.kamezajo.sns.controller;

import br.com.kamezajo.sns.service.SnsNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sns")
@RequiredArgsConstructor
public class SnsController {

    private final SnsNotificationService notificationService;

    @GetMapping("/send-topic-message")
    @ResponseStatus(HttpStatus.OK)
    public void sendMessage(@RequestParam("message") String message) {
        notificationService.sendNotification("Subject: Hello", message, null);
    }

}
