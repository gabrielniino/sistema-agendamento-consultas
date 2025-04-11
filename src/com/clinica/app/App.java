package com.clinica.app;

import java.time.LocalDate;

import com.clinica.model.Consulta;
import com.clinica.model.Medico;
import com.clinica.model.Paciente;
import com.clinica.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente("Gabriel Pereira", "12345678901", LocalDate.of(2000, 7, 27), "Unimed");
        Medico m1 = new Medico("Dra. Rafaela Paes", "98765432100", LocalDate.of(2003, 6, 30), "Cardiologia");

        Consulta consulta1 = new Consulta();
        consulta1.setPaciente(p1);
        consulta1.setMedico(m1);
        consulta1.marcarConsulta("2025-04-15", "14:30");

        Consulta consulta2 = new Consulta();
        consulta2.setPaciente(p1);
        consulta2.setMedico(m1);
        consulta2.marcarConsulta("2025-04-20", "10:00", "Consulta de retorno");

        System.out.println(p1);
        System.out.println(m1);
        System.out.println(consulta1);
        System.out.println(consulta2);

        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = p1;
        pessoas[1] = m1;

        System.out.println("\nIterando vetor de Pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
