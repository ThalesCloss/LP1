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
public class Crianca {
    private Sexo sexo;
    private double peso;

    public Crianca(Sexo sexo, double peso) {
        this.sexo = sexo;
        this.peso = peso;
    }
   
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
