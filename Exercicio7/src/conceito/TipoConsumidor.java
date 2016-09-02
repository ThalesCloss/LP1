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
public enum TipoConsumidor {
    RESIDENCIAL("Residencial",2.67),
    COMERCIAL("Comercial",3.34),
    INDUSTRIAL("Industrial",2.97);
    private final String descricao;
    private final double valorKw;
    TipoConsumidor(String descricao,double valorKw){
        this.descricao=descricao;
        this.valorKw=valorKw;
    }
    
    public double valorKw(){
        return valorKw;
    }
    public String nome(){
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
