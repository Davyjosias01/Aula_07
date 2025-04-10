package com.mycompany.aula_07;

public class AssistenteAdministrativo extends Assistente{
    private double adicionalNoturno;

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public Salario getSalario() {
        return salario;
    }

    @Override
    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public AssistenteAdministrativo(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public AssistenteAdministrativo(double adicionalNoturno, int matricula) {
        super(matricula);
        this.adicionalNoturno = adicionalNoturno;
    }

    public AssistenteAdministrativo(double adicionalNoturno, int matricula, String nome, Salario salario) {
        super(matricula, nome, salario);
        this.adicionalNoturno = adicionalNoturno;
    }

    public AssistenteAdministrativo(double adicionalNoturno, int matricula, String nome, double qtd_horas, double val_hora) {
        super(matricula, nome, qtd_horas, val_hora);
        this.adicionalNoturno = adicionalNoturno;
    }

    public AssistenteAdministrativo(double adicionalNoturno, int matricula, String nome, double s) {
        super(matricula, nome, s);
        this.adicionalNoturno = adicionalNoturno;
    }
    
    
    public void calculaAdicionalNoturno(){
        super.adicionaAumentoValor(adicionalNoturno);
    }
}
