package com.mycompany.aula_07;

public class AssistenteTecnico extends Assistente{
    private double bonusSalarial;

    public double getBonusSalarial() {
        return bonusSalarial;
    }
    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }    
    
    public AssistenteTecnico() { }
    public AssistenteTecnico(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    public AssistenteTecnico(double bonusSalarial, int matricula) {
        super(matricula);
        this.bonusSalarial = bonusSalarial;
    }
    public AssistenteTecnico(double bonusSalarial, int matricula, String nome, Salario salario) {
        super(matricula, nome, salario);
        this.bonusSalarial = bonusSalarial;
    }
    public AssistenteTecnico(double bonusSalarial, int matricula, String nome, double qtd_horas, double val_hora) {
        super(matricula, nome, qtd_horas, val_hora);
        this.bonusSalarial = bonusSalarial;
    }
    public AssistenteTecnico(double bonusSalarial, int matricula, String nome, double s) {
        super(matricula, nome, s);
        this.bonusSalarial = bonusSalarial;
    }
    
    //Método para calcular bônus salarial
    public void calculaBonusSalarial(){
        super.adicionaAumentoValor(bonusSalarial);
    }
}
