package com.clinica.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private LocalTime hora;
    private String descricao;

    public void marcarConsulta(String data, String hora) {
        this.data = LocalDate.parse(data);
        this.hora = LocalTime.parse(hora);
        this.descricao = "Consulta padrão";
    }

    public void marcarConsulta(String data, String hora, String descricao) {
        this.data = LocalDate.parse(data);
        this.hora = LocalTime.parse(hora);
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Consulta: " + paciente.getNome() + " com Dr. " + medico.getNome() +
                ", Data: " + data + ", Hora: " + hora + ", Descrição: " + descricao;
    }
}
