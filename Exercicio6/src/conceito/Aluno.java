/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

/**
 *
 * @author DPPG01
 */
public class Aluno {
    private int matricula;
    private double n1,n2,n3,frequencia;
    private final double MEDIA=6,FREQUENCIA_MINIMA=75;
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    public double calculaMedia(){
        return (n1+n2+n3)/3;
    }
    public boolean aprovadoFrequencia(){
        return (frequencia>=FREQUENCIA_MINIMA)?true:false;            
    }
    public boolean aprovado(){
        return (calculaMedia()>=MEDIA&&aprovadoFrequencia())?true:false;
    }
}
