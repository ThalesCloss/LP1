/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Comodos;
import conceito.Residencia;
import conceito.TiposComodos;
import javax.swing.JOptionPane;

/**
 *
 * @author tcloss
 */
public class Pricipal {
    public static void main(String[] args) {
        int potencia =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a potência da lâmpada que será utilizada"));
        Residencia residencia = new Residencia(potencia);
        
        do{
            residencia.adicionarComodo(new Comodos((TiposComodos) JOptionPane.showInputDialog(null, "Comodo", "Tipo do comodo?",JOptionPane.QUESTION_MESSAGE,null, TiposComodos.values(), TiposComodos.values()[0]), 
                                       Integer.parseInt(JOptionPane.showInputDialog(null,"Comprimento do comodo?")), Integer.parseInt(JOptionPane.showInputDialog(null,"Largura do comodo?"))));
            
        }while(JOptionPane.showConfirmDialog(null, "Continuar?","Adicionar mais cômodos?",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
        for(Comodos c:residencia.getComodos()){
            System.out.println(c.toString());
            }
    }
    
}
