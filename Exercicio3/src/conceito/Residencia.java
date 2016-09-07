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
    public Residencia(){
        comodos=new ArrayList<Comodos>();
    }
    
    public void adicionarComodo(Comodos comodo){
        comodos.add(comodo);
    }
    
    public int totalLampadasResidencia(){
        int total=0;
        for(Comodos tmp: comodos){
            total+=tmp.lampadasNecessarias();
        }
        
        return total;
    }
    
    public double totalPotenciaResidencia(){
        double potencia=0;
        for(Comodos tmp: comodos){
            potencia+=tmp.potenciaNecessaria();
        }
        return potencia;
    }
    
    public List<Comodos> getComodos(){
        return comodos;
    }
    
    
    
}
