package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Popula o banco H2 em memoria com fornecedores de teste assim que a aplicacao sobe.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new Fornecedor("Ferragens Santa Luzia Ltda", "11111111111111"));
        fornecedorRepository.save(new Fornecedor("Distribuidora Paulista de Alimentos Ltda", "22222222222222"));
        fornecedorRepository.save(new Fornecedor("Papelaria Nova Esperanca", "33333333333333"));
        fornecedorRepository.save(new Fornecedor("Madeireira Sao Jorge", "44444444444444"));
        fornecedorRepository.save(new Fornecedor("Oliveira e Costa Embalagens Ltda", "55555555555555"));
    }
}
