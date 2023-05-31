package br.com.kamezajo.ssm.controller;

import br.com.kamezajo.ssm.config.ParameterStoreConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ParameterStoreController {

    private final ParameterStoreConfiguration parameterStoreConfiguration;

    @GetMapping("/parameterStoreConfiguration")
    @ResponseStatus(HttpStatus.CREATED)
    public String configuration() {
        return parameterStoreConfiguration.getHelloWorld();
    }
}
