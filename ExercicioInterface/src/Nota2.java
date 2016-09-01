/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Nota2 extends Nota1 {
    
    public Nota2(double n1, double n2) {
        super(n1, n2);
    }
    
    public double calcularMedia(){
        return (this.getNota1()*2+this.getNota2()*3)/5;
    }
}
