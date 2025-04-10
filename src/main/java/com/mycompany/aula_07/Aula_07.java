package com.mycompany.aula_07;

public class Aula_07 {

    public static void main(String[] args) {
        
        Salario s = new Salario(100, 200);
        
        AssistenteTecnico a = new AssistenteTecnico(1500, 13, "Samuel de Marco", s);
        a.exibeDados();
        
        a.calculaBonusSalarial();
        
        a.exibeDados();
    }
}
