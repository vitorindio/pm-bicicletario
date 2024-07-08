package com.example.bicicletario.bicicletario.domain;

import com.example.bicicletario.bicicletario.domain.enums.Nacionalidade;
import com.example.bicicletario.bicicletario.domain.enums.StatusCiclista;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciclista")
public class Ciclista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "numero")
    public String numero;

    @Column(name = "validade")
    public String validade;

    @Column(name = "pais")
    public String pais;

    @Column(name = "status")
    public StatusCiclista statusCiclista;

    @Column(name = "nacionalidade")
    public Nacionalidade nacionalidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public StatusCiclista getStatusCiclista() {
        return statusCiclista;
    }

    public void setStatusCiclista(StatusCiclista statusCiclista) {
        this.statusCiclista = statusCiclista;
    }
}
