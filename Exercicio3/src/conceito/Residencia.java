/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tcloss
 */
public class Residencia {
    private List<Comodos> comodos;
    private int potenciaLampada;
    public Residencia(int potenciaLampada){
        comodos=new ArrayList<Comodos>();
        this.potenciaLampada=potenciaLampada;
    }
    
    public void adicionarComodo(Comodos comodo){
        comodos.add(comodo);
    }
    
    public int totalLampadasResidencia(){
        int total=0;
        for(Comodos tmp: comodos){
            total+=tmp.lampadasNecessarias(potenciaLampada);
        }
        System.out.println("Número total de lâmpadas necessárias "+total);
        return total;
    }
    
    public double totalPotenciaResidencia(){
        double potencia=0;
        for(Comodos tmp: comodos){
            potencia+=tmp.potenciaNecessaria();
        }
        System.out.println("Potência total necessária "+potencia);
        return potencia;
    }
    
    public List<Comodos> getComodos(){
        return comodos;
    }
    
    public void informacoesComodos(){
        for(Comodos c:comodos){
            System.out.println(c.toString());
            System.out.println("Potência necessária: "+ c.potenciaNecessaria()+"/ potência da lâmpada "+potenciaLampada);
            System.out.println("Lâmpadas necessárias: "+c.lampadasNecessarias(potenciaLampada));
            }
    }
    
}
