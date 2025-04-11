package com.clinica.model;

public class Paciente extends Pessoa {
    private String planoSaude;

    public Paciente(String nome, String cpf, java.time.LocalDate dataNascimento, String planoSaude) {
        super(nome, cpf, dataNascimento);
        this.planoSaude = planoSaude;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public String toString() {
        return super.toString() + ", Plano de Saúde: " + planoSaude;
    }
}

