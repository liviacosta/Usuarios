package br.com.liviacosta.userapi.mapper;

import org.springframework.stereotype.Component;

import br.com.liviacosta.userapi.dto.ReuDto;
import br.com.liviacosta.userapi.entity.Reu;

@Component
public class ReuMapper {
  public Reu toEntity(ReuDto dto) {
    return new Reu(dto.getId(), dto.getNome(), dto.getEndereco(), dto.getCpf());
  }

  public ReuDto toDomainObj(Reu entity) {
    return new ReuDto(entity);
  }

}
