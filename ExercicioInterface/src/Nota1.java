/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Nota1 implements INota {
    private double n1,n2;
    
    public Nota1(double n1,double n2){
       this.setNota1(n1);
       this.setNota2(n2);
    }
    public void setNota1(double n1){
        if(n1>=NOTA_MINIMA && n1<=NOTA_MAXIMA)
            this.n1=n1;
    }
    public void setNota2(double n2){
        if(n2>=NOTA_MINIMA && n2<=NOTA_MAXIMA)
            this.n2=n2;
    }
    public double getNota1(){
        return n1;
    }
    public double getNota2(){
        return n2;
    }
    @Override
    public double calcularMedia() {
        return (n1+n2)/2;
    }
    
}
