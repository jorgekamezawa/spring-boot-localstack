package br.com.kamezajo.ssm.controller;

import br.com.kamezajo.ssm.config.ParameterStoreConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parameter-store")
@RequiredArgsConstructor
public class ParameterStoreController {

    private final ParameterStoreConfiguration service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getParameter() {
        return service.getHelloWorld();
    }
}
