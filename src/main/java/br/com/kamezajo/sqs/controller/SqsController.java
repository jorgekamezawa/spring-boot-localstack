package br.com.kamezajo.sqs.controller;

import br.com.kamezajo.sqs.service.SqsMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sqs")
@RequiredArgsConstructor
public class SqsController {

    private final SqsMessageService service;

    @GetMapping("/sendMessage")
    @ResponseStatus(HttpStatus.OK)
    public void sendMessage(@RequestParam("message") String message) {
        service.sendMessage(message);
    }

}
