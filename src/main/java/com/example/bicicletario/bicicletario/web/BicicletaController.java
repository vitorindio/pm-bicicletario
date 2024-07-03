package com.example.bicicletario.bicicletario.web;

import com.example.bicicletario.bicicletario.domain.Bicicleta;
import com.example.bicicletario.bicicletario.domain.enums.Status;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Bicicletas", description = "Operações relacionadas a bicicletas")
public class BicicletaController {

    @Operation(summary = "Lista todas as bicicletas")
    @GetMapping("/api/bicicletas")
    public List<Bicicleta> listarBicicletas() {
        return List.of(
                new Bicicleta("Caloi", "Vermelha", "2020", 1, Status.DISPONIVEL),
                new Bicicleta("Monark", "Azul", "2021", 2, Status.DISPONIVEL)
        );
    }


}
