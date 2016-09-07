/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

import java.util.Objects;

/**
 *
 * @author tcloss
 */
public class Comodos {
    private TiposComodos tipo;
    private double comprimento, largura, potencia;
    
    public Comodos(TiposComodos tipo,double comprimento, double largura, double potencia){
        this.tipo=tipo;
        this.comprimento=comprimento;
        this.largura=largura;
        this.potencia=potencia;
        
    }

    public TiposComodos getTipo() {
        return tipo;
    }

    public void setTipo(TiposComodos tipo) {
        this.tipo = tipo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.tipo);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.comprimento) ^ (Double.doubleToLongBits(this.comprimento) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.largura) ^ (Double.doubleToLongBits(this.largura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comodos other = (Comodos) obj;
        if (Double.doubleToLongBits(this.comprimento) != Double.doubleToLongBits(other.comprimento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.largura) != Double.doubleToLongBits(other.largura)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cômodo: "+tipo.nome()+"\nComprimento: "+comprimento+"\nLargura: "+largura+"\nPotência/m²:"+tipo.potencia()+"\nÁrea: "+this.calculaArea()+" m²";
    }
    
    public double calculaArea(){
        return comprimento*largura;
    }
    
    public double potenciaNecessaria(){
        return (this.largura*this.comprimento)*this.tipo.potencia();
    }
    
    public int lampadasNecessarias(){
        return (int) Math.ceil(this.potenciaNecessaria()/this.potencia);
    }
    
}
