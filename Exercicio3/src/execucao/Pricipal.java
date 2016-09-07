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
        
        Residencia residencia = new Residencia();
        
        do{
            residencia.adicionarComodo(new Comodos((TiposComodos) 
                    JOptionPane.showInputDialog(null, "Comodo", "Tipo do comodo?",JOptionPane.QUESTION_MESSAGE,null, TiposComodos.values(), TiposComodos.values()[0]),
                    Double.parseDouble(JOptionPane.showInputDialog(null,"Comprimento do comodo?").replace(",", ".")),
                    Double.parseDouble(JOptionPane.showInputDialog(null,"Largura do comodo?").replace(",", ".")),
                    Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a potência da lâmpada que será utilizada").replace(",", "."))));
            
        }while(JOptionPane.showConfirmDialog(null, "Continuar?","Adicionar mais cômodos?",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
        
        System.out.println("################################");
        System.out.println("Informações dos comodos");
        for(Comodos c:residencia.getComodos()){
            System.out.println(c.toString());
            System.out.println("Potência necessária: "+ c.potenciaNecessaria()+" / potência da lâmpada "+c.getPotencia());
            System.out.println("Lâmpadas necessárias: "+c.lampadasNecessarias());
            }
        System.out.println("################################");
        System.out.println("Informações da residência");
        System.out.println("Potência total necessária "+residencia.totalPotenciaResidencia());
        System.out.println("Número total de lâmpadas necessárias "+residencia.totalLampadasResidencia());
        System.exit(0);
    }
    
}
