package br.com.kamezajo.rds.repository;

import br.com.kamezajo.rds.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UUID> {
}
