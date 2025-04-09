package com.mycompany.aula_07;

public class Salario {
    static final double IRFAIXA0    = 1434.0;
    static final double IRFAIXA1    = 2150.0;
    static final double IRFAIXA2    = 2886.0;
    static final double IRFAIXA3    = 3582.0;
    static final double IRALIQUOTA0 = 0.0;
    static final double IRALIQUOTA1 = 0.075;
    static final double IRALIQUOTA2 = 0.15;
    static final double IRALIQUOTA3 = 0.225;
    static final double IRALIQUOTA4 = 0.275;
    
    static final double INSSFAIXA0      = 965.67;
    static final double INSSFAIXA1      = 1609.45;
    static final double INSSALIQUOTA0   = 0.08;
    static final double INSSALIQUOTA1   = 0.09;
    static final double INSSALIQUOTA2   = 0.11;
    static final double MAXINSS         = 354.07;
    
    static final double FGTSALIQUOTA    = 0.08;
    static final double CONTSINDICATO   = 0.05;
    
    private double salarioBruto;
    private double ir;
    private double inss;
    private double sindicato;
    private double salarioLiquido;
    private double fgts;
    
    public double getSalarioBruto() { return this.salarioBruto; }
    public double getIr() { return this.ir; }
    public double getInss() { return this.inss; }
    public double getSindicato() { return this.sindicato; }
    public double getSalarioLiquido() { return this.salarioLiquido; }
    public double getFgts() { return this.fgts; }
    
    public void setSalarioBruto(double s) { this.salarioBruto = s; }
    public void setIr(double i) { this.ir = i; }
    public void setInss(double i) { this.inss = i; }
    public void setSindicato(double s) { this.sindicato = s; }
    public void setSalarioLiquido(double sl) { this.salarioLiquido = sl; }
    public void setFgts(double f) { this.fgts = f; }
    
    public Salario() { }
    public Salario(double valorHora, double qtdHoras) {
        this.salarioBruto = valorHora * qtdHoras;
        this.fechaFolha();
    }
    
    public void calculaSalarioBruto(double valorHora, double qtdHoras) {
        this.salarioBruto = valorHora * qtdHoras;
    }
    
    public void calculaIr() {
        double sb = this.salarioBruto;
        double i;
        
        i = switch(sb) {
            case double s when s <= IRFAIXA0 -> IRALIQUOTA0;
            case double s when s <= IRFAIXA1 -> IRALIQUOTA1;
            case double s when s <= IRFAIXA2 -> IRALIQUOTA2;
            case double s when s <= IRFAIXA3 -> IRALIQUOTA3;
            default -> IRALIQUOTA4;
        };
        this.ir = this.salarioBruto * i;
    }
    
    public void calculaInss() {
        double sb = this.salarioBruto;
        double i;
        
        i = switch(sb) {
            case double s when s <= INSSFAIXA0 -> INSSALIQUOTA0;
            case double s when s <= INSSFAIXA1 -> INSSALIQUOTA1;
            default -> INSSALIQUOTA2;
        };
        this.inss = (this.salarioBruto * i > MAXINSS)?MAXINSS:(this.salarioBruto * i)%.2f;
    }
    
    public void calculaSindicato() {
        this.sindicato = this.salarioBruto * CONTSINDICATO;
    }
    
    public void calculaFgts() {
        this.fgts = this.salarioBruto * FGTSALIQUOTA;
    }
    
    public void calculaSalarioLiquido() {
        this.salarioLiquido = this.salarioBruto - this.ir - this.inss - this.sindicato;
    }
    
    final void fechaFolha(){
        this.calculaIr();
        this.calculaInss();
        this.calculaSindicato();
        this.calculaFgts();
        this.calculaSalarioLiquido();
    }
        
    public void exibeSalario() {
        fechaFolha();
        System.out.println("(+) Salario Bruto   : " + this.salarioBruto);
        System.out.println("(-) IR              : " + this.ir);
        System.out.println("(-) INSS            : " + this.inss);
        System.out.println("(-) Sindicato       : " + this.sindicato);
        System.out.println("(=) Salario Liquido : " + this.salarioLiquido);
        System.out.println("FGTS                : " + this.fgts);
    }
}