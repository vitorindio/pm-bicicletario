package com.example.bicicletario.bicicletario.application;

import com.example.bicicletario.bicicletario.infraestructure.CiclistaRepository;
import org.springframework.stereotype.Service;

@Service
public class CiclistaService {

    private final CiclistaRepository ciclistaRepository;

    public CiclistaService(CiclistaRepository ciclistaRepository) {
        this.ciclistaRepository = ciclistaRepository;
    }

    public Bicicleta criarBicicleta(Bicicleta bicicleta) {
        return ciclistaRepository.criarBicicleta(bicicleta);
    }
}
