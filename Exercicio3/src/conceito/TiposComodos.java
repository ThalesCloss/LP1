/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

/**
 *
 * @author tcloss
 */
public enum TiposComodos {
    QUARTO(15,"Quarto"),
    SALA_TV(15,"Sala de TV"),
    SALAS(18,"Salas"),
    COZINHA(18,"Cozinha"),
    VARANDAS(18,"Varandas"),
    ESCRITORIOS(20,"Escritórios"),
    BANHEIRO(20,"Banheiro");
    private final int potencia;
    private final String nome;
    TiposComodos(int potencia,String nome){
        this.potencia=potencia;
        this.nome=nome;
    }
    public int potencia(){
        return potencia;
    }
    public String nome(){
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
