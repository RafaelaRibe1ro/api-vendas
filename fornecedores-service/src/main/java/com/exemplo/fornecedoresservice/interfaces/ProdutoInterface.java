package com.exemplo.fornecedoresservice.interfaces;

import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// O nome e' o registrado no Eureka: o Feign descobre o endereco sozinho.
@FeignClient(name = "produtos-service")
public interface ProdutoInterface {

    @GetMapping("/produtos")
    List<ProdutoDTO> listarTodos();
}
