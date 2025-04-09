package com.mycompany.aula_07;

public class Assistente extends Funcionario{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Assistente(){}
    
    public Assistente(int matricula) {
        this.matricula = matricula;
    }

    public Assistente(int matricula, String nome, Salario salario) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public Assistente(int matricula, String nome, double qtd_horas, double val_hora) {
        super(nome, qtd_horas, val_hora);
        this.matricula = matricula;
    }

    public Assistente(int matricula, String nome, double s) {
        super(nome, s);
        this.matricula = matricula;
    }
    
//  Método exibe dados sobrescrito ao exibe dados do funcionário
    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Matricula: " + this.getMatricula());
    }
}
