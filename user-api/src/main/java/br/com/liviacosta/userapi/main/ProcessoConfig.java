package br.com.liviacosta.userapi.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.liviacosta.userapi.mapper.ProcessoMapper;
import br.com.liviacosta.userapi.mapper.ReuMapper;

@Configuration
public class ProcessoConfig {

  @Bean
  ProcessoMapper processoMapper() {
    return new ProcessoMapper();
  }
  
  @Bean
  ReuMapper reuMapper() {
    return new ReuMapper();
  }
}