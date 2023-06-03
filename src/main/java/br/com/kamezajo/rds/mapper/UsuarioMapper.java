package br.com.kamezajo.rds.mapper;

import br.com.kamezajo.rds.dto.UsuarioDto;
import br.com.kamezajo.rds.entity.UsuarioEntity;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface UsuarioMapper {

    UsuarioDto toDto(final UsuarioEntity entity);

    UsuarioEntity toEntity(final UsuarioDto dto);
}
