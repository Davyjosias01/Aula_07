package com.mycompany.aula_07;

public class Funcionario {
    Salario salario;
    private String nome;

//  Getters n setters
    public Salario getSalario() {
        return salario;
    }
    public void setSalario(Salario salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
//  Construtores
    public Funcionario(){
    }
    public Funcionario(String nome, Salario salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(String nome, double qtd_horas, double val_hora){
        this.nome = nome;
        this.salario = new Salario(val_hora, qtd_horas);
    }
    public Funcionario(String nome, double s){
        this.nome = nome;
        this.salario = new Salario();
        this.salario.setSalarioBruto(s);
    }

    
//  Método adiciona salário por porcentagem:
    public void adicionaAumentoPorcent(double porcent){
        double valorAtual = this.salario.getSalarioBruto();
        double aumento = valorAtual*(porcent*0.01f);
        this.salario.setSalarioBruto(valorAtual+aumento);       
    }
    
//  Método adiciona aumento por valor 
    public void adicionaAumentoValor(double valorAdicional){
        double valorAtual = this.salario.getSalarioBruto();
        this.salario.setSalarioBruto(valorAtual+valorAdicional);
    }
    
//  Método ganho anual bruto
    public double ganhoAnualBruto(){
        return this.salario.getSalarioBruto()*13.33f;
    }

//  Método ganho anual liquido
    public double ganhoAnualLiquido(){
        return this.salario.getSalarioLiquido()*13.33f;
    }
    
    public void exibeDados(){
        this.salario.exibeSalario();
        System.out.println("Nome: " + this.nome);
    }
}
