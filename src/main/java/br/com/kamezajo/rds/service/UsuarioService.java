package br.com.kamezajo.rds.service;

import br.com.kamezajo.rds.dto.UsuarioDto;
import br.com.kamezajo.rds.mapper.UsuarioMapper;
import br.com.kamezajo.rds.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioDto save(UsuarioDto dto) {
        return usuarioMapper.toDto(usuarioRepository.save(usuarioMapper.toEntity(dto)));
    }

    public List<UsuarioDto> findAll() {
        return usuarioRepository.findAll().stream().map(it -> usuarioMapper.toDto(it)).toList();
    }

    public UsuarioDto findById(UUID id) {
        return usuarioMapper.toDto(usuarioRepository.findById(id).get());
    }
}
