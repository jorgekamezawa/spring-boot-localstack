package br.com.kamezajo.secretsmanager.controller;

import br.com.kamezajo.secretsmanager.service.SecretsManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secrets-manager")
@RequiredArgsConstructor
public class SecretsManagerController {

    private final SecretsManagerService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getSecret() {
        return service.findSecret();
    }

}
