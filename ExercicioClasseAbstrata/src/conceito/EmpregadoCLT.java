/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

/**
 *
 * @author aluno
 */
public class EmpregadoCLT extends Empregado {
    private double salarioBase, pINSS, pIR, valorSalarioFamilia;
    private int numeroFilho;
    
    public EmpregadoCLT(){
        super();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase>0)
            this.salarioBase = salarioBase;
        else
            System.out.println("O valor do salário base deve ser maior que zero");
    }

    public double getpINSS() {
        return pINSS;
    }

    public void setpINSS(double pINSS) {
        if(pINSS>=0 && pINSS<=100)
            this.pINSS = pINSS;
        else
            System.out.println("O valor percentual do INSS deve estar entre 0% e 100%");
    }

    public double getpIR() {
        return pIR;
    }

    public void setpIR(double pIR) {
        if(pIR>=0 && pIR<=100)
            this.pIR = pIR;
        else
            System.out.println("O valor percentual do IR deve estar entre 0% e 100%");
    }

    public double getValorSalarioFamilia() {
        return valorSalarioFamilia;
    }

    public void setValorSalarioFamilia(double valorSalarioFamilia) {
        this.valorSalarioFamilia = valorSalarioFamilia;
    }

    public int getNumeroFilho() {
        return numeroFilho;
    }

    public void setNumeroFilho(int numeroFilho) {
        if(numeroFilho>=0)
            this.numeroFilho = numeroFilho;
        else
            System.out.println("O numero de filhos deve ser positivo");
    }
    
    

    @Override
    public double calcularSalario() {
        double totSalFam=(numeroFilho>3)?valorSalarioFamilia*3:valorSalarioFamilia*numeroFilho;
        double Ir   =   (salarioBase*pIR)/100;
        double Inss =   (salarioBase*pINSS)/100;
        return salarioBase+totSalFam-Ir-Inss;
    }
    
}
