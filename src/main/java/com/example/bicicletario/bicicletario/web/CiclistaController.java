package com.example.bicicletario.bicicletario.web;

import com.example.bicicletario.bicicletario.application.CiclistaService;
import com.example.bicicletario.bicicletario.domain.enums.StatusCiclista;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CiclistaController {

    private final CiclistaService ciclistaService;

    public CiclistaController(CiclistaService ciclistaService) {
        this.ciclistaService = ciclistaService;
    }

    @GetMapping("/bicicletas")
    public List<Bicicleta> listarBicicletas() {
        return List.of(new Bicicleta("marca", "modelo", "2021", 1, StatusCiclista.DISPONIVEL));

    }

    @PostMapping("/bicicletas")
    public Bicicleta criarBicicleta(Bicicleta bicicleta) {
        return ciclistaService.criarBicicleta(bicicleta);
    }

}



