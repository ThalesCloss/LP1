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
    private double comprimento, largura;
    
    public Comodos(TiposComodos tipo,double comprimento, double largura){
        this.tipo=tipo;
        this.comprimento=comprimento;
        this.largura=largura;
        
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
        return "Comodo: "+tipo.nome()+" Comprimento:"+comprimento+" Largura:"+largura+" Potência/m²:"+tipo.potencia();
    }
    
    
    public double potenciaNecessaria(){
        return (this.largura*this.comprimento)*this.tipo.potencia();
    }
    
    public int lampadasNecessarias(int potenciaLampada){
        return (int) Math.ceil(this.potenciaNecessaria()/potenciaLampada);
    }
    
}
