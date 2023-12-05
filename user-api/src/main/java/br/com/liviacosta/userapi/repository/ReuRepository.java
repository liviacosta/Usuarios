package br.com.liviacosta.userapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.liviacosta.userapi.entity.Reu;


public interface ReuRepository extends JpaRepository<Reu, Long>{
    List<Reu> findByCpfContaining(String cpf);
    
} 