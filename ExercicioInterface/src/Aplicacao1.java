/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Aplicacao1 {
    public static void main(String[] args) {
        INota nota1 = new Nota1(6, 9);
        
        System.out.println("Média da nota1 = "+nota1.calcularMedia());
    }
}
