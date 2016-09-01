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
public class EmpregadoHorista extends Empregado {
    private double valorHora,
            numeroHora;
    
    public EmpregadoHorista(){
        super();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora>0)
            this.valorHora = valorHora;
        else
        System.out.println("O valor da hora deve ser maior que zero");
    }

    public double getNumeroHora() {
        return numeroHora;
    }

    public void setNumeroHora(double numeroHora) {
        if(numeroHora>0)
            this.numeroHora = numeroHora;
        else
            System.out.println("O numero de horas deve ser maior que zero");
    }

    @Override
    public double calcularSalario() {
        return numeroHora*valorHora;
    }
    
    
}
