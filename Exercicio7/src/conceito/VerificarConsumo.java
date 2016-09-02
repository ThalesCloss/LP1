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
 * @author DPPG01
 */
public class VerificarConsumo {
    private List<Consumidor> consumidores;
    
    public VerificarConsumo(){
        consumidores=new ArrayList<Consumidor>();
    }
    public void adicionarConsumidor(Consumidor consumidor){
        consumidores.add(consumidor);
    }
    public List<Consumidor> getConsumidores(){
        return consumidores;
    }
    
    public List<Consumidor> getConsumidoresPorTipo(TipoConsumidor tipo){
        List<Consumidor> aux = new ArrayList<Consumidor>();
        for(Consumidor c:consumidores){
            if(c.getTipo()==tipo)
                aux.add(c);
        }
        return aux;
    }
    
    public double totalConsumoKw(List<Consumidor> consumidores){
        double total=0;
        for(Consumidor c:consumidores)
        {
            total+=c.getQuntidadeKw();
        }
        return total;
    }
    public double totalConsumo(List<Consumidor> consumidores,TipoConsumidor tipo){
        return totalConsumoKw(consumidores)*tipo.valorKw();
    }
    
    public double mediaConsumo(List<Consumidor> consumidores){
        return totalConsumoKw(consumidores)/consumidores.size();
    }
}
