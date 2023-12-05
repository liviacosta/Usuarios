package br.com.liviacosta.userapi.mapper;

import org.springframework.stereotype.Component;

import br.com.liviacosta.userapi.dto.ProcessoDto;
import br.com.liviacosta.userapi.entity.Processo;

@Component
public class ProcessoMapper {
    public Processo toEntity(ProcessoDto processoDomainObj) {
        return new Processo(processoDomainObj.getId(), processoDomainObj.getCodigoProcesso());
    }

    public ProcessoDto toDomainObj(Processo userEntity) {
        return new ProcessoDto(userEntity);
    }
    
}
