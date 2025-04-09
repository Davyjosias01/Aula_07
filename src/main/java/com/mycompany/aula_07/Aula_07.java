package com.mycompany.aula_07;

public class Aula_07 {

    public static void main(String[] args) {
        
        Salario s = new Salario(100, 200);
        
        Funcionario f = new Funcionario("Davy", s);
   
        f.exibeDados();
        
        f.adicionaAumentoValor(1000);
        
        f.exibeDados();
    }
}
