package br.com.liviacosta.userapi.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.liviacosta.userapi.entity.Processo;
import jakarta.validation.constraints.NotBlank;

public class ProcessoDto {
    private Long id;
    @NotBlank
    private String codigoProcesso;
    
    private List<ReuDto> reus = new ArrayList<>();

    public ProcessoDto(Long id, String codigoProcesso, List<ReuDto> reus) {
        this.id = id;
        this.codigoProcesso = codigoProcesso;
        this.reus = reus;
    }

    public ProcessoDto(Processo entity) {
		id = entity.getId();
		codigoProcesso = entity.getCodigoProcesso();
        this.reus = entity.getReus().stream().map((r) -> new ReuDto(r)).toList();
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoProcesso() {
        return codigoProcesso;
    }

    public void setCodigoProcesso(String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }

    public List<ReuDto> getReus() {
        return reus;
    }

    public void setReus(List<ReuDto> reus) {
        this.reus = reus;
    }
}
