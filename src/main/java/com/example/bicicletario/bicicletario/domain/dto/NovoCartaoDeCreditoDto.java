package com.example.bicicletario.bicicletario.domain.dto;

public class NovoCartaoDeCreditoDto {
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;
    private String nacionalidade;

    public NovoCartaoDeCreditoDto(String nome, String email, String cpf, String dataNascimento, String nacionalidade, Long passaporte, String urlFotoDocumento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.passaporte = passaporte;
        this.urlFotoDocumento = urlFotoDocumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Long getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Long passaporte) {
        this.passaporte = passaporte;
    }

    public String getUrlFotoDocumento() {
        return urlFotoDocumento;
    }

    public void setUrlFotoDocumento(String urlFotoDocumento) {
        this.urlFotoDocumento = urlFotoDocumento;
    }
}
