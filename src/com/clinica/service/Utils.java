package com.clinica.service;

public class Utils {
    public static boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }
}
