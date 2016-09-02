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
public class Consumidor {
    private int numeroConsumidor;
    private double quntidadeKw;
    private TipoConsumidor tipo;

    public int getNumeroConsumidor() {
        return numeroConsumidor;
    }

    public void setNumeroConsumidor(int numeroConsumidor) {
        this.numeroConsumidor = numeroConsumidor;
    }

    public double getQuntidadeKw() {
        return quntidadeKw;
    }

    public void setQuntidadeKw(double quntidadeKw) {
        this.quntidadeKw = quntidadeKw;
    }

    public TipoConsumidor getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsumidor tipo) {
        this.tipo = tipo;
    }
    
    public double totalPagar(){
        return quntidadeKw*tipo.valorKw();
    }
}
