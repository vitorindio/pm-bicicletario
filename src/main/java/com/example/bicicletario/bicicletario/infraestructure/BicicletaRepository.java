package com.example.bicicletario.bicicletario.infraestructure;

import com.example.bicicletario.bicicletario.domain.Bicicleta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BicicletaRepository {


    public Bicicleta criarBicicleta(Bicicleta bicicleta) {
        bicicleta.setId(1);
        bicicleta.setMarca(bicicleta.getMarca());
        bicicleta.setModelo(bicicleta.getModelo());
        bicicleta.setAno(bicicleta.getAno());
        bicicleta.setNumero(bicicleta.getNumero());
        bicicleta.setStatus(bicicleta.getStatus());
        return bicicleta;
    }



}
