package com.clinica.model;

public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, String cpf, java.time.LocalDate dataNascimento, String especialidade) {
        super(nome, cpf, dataNascimento);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade;
    }
}
