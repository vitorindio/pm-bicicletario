package com.example.bicicletario.bicicletario.infraestructure;

import org.springframework.stereotype.Repository;

@Repository
public class CiclistaRepository {


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
