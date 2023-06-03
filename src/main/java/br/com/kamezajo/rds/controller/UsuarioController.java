package br.com.kamezajo.rds.controller;

import br.com.kamezajo.rds.dto.UsuarioDto;
import br.com.kamezajo.rds.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto save(@RequestBody final UsuarioDto dto) {
        return service.save(dto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioDto findAll(@PathVariable UUID id) {
        return service.findById(id);
    }
}
