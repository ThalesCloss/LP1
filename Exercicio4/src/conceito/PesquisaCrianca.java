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
public class PesquisaCrianca {
    private List<Crianca> criancas;
    
    public PesquisaCrianca(){
        criancas=new ArrayList<Crianca>();
    }
    
    public void adicionarCrianca(Crianca crianca){
        criancas.add(crianca);
    }
    
    public List<Crianca> criancasPorSexo(List<Crianca> criancas,Sexo sexo){
        List<Crianca> sub = new ArrayList<Crianca>();
        for(Crianca crianca:criancas){
            if(crianca.getSexo()==sexo)
                sub.add(crianca);
        }
        return sub;
    }
    
    public List<Crianca> criancasPorPeso(List<Crianca> criancas,double peso, ComparadorPeso comparador){
        List<Crianca> sub = new ArrayList<Crianca>();
        
            for(Crianca crianca:criancas){
                if(comparador==comparador.MAIOR){
                    if(crianca.getPeso()>peso)
                        sub.add(crianca);
                }
                else if(comparador==ComparadorPeso.MENOR)
                {
                    if(crianca.getPeso()<peso)
                        sub.add(crianca);
                }
                if(comparador==comparador.MAIOR_IGUAL){
                    if(crianca.getPeso()>=peso)
                        sub.add(crianca);
                }
                else if(comparador==ComparadorPeso.MENOR_IGUAL)
                {
                    if(crianca.getPeso()<=peso)
                        sub.add(crianca);
                }
            }
        return sub;
    }
    public int quantidadeCriancas(){
        return criancas.size();
    }
    
    public List<Crianca> getCriancas(){
        return criancas;
    }
}
