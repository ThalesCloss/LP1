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
public class ConsultaCandidato {
    private List<Candidato> candidatos;
    
    public ConsultaCandidato(){
        candidatos=new ArrayList<Candidato>();
    }
    public void adicionarCandidato(Candidato candidato){
        candidatos.add(candidato);
    }
    
    public List<Candidato> getCandidatos(){
        return candidatos;
    }
    
    public List<Candidato> getCandidatosPorSexo(List<Candidato> candidatos,SexoCandidato sexo){
        List<Candidato> aux = new ArrayList<Candidato>();
        for(Candidato c:this.candidatos)
        {
            if(c.getSexo()==sexo)
                aux.add(c);
        }
        return aux;
    }
    
    public List<Candidato> getCandidatosPorExperiencia(List<Candidato> candidatos, boolean experiencia){
        List<Candidato> aux = new ArrayList<Candidato>();
        for(Candidato c:candidatos){
            if(c.isExperience()==experiencia)
                aux.add(c);
        }
        return aux;
    }
    public List<Candidato> getCandidatosPorFaixaEtaria(List<Candidato> candidatos, int idadeInicial, int idadeFinal){
        List<Candidato> aux = new ArrayList<Candidato>();
        for(Candidato c:candidatos){
            if(c.getIdade()>=idadeInicial && c.getIdade()<=idadeFinal)
                aux.add(c);
        }
        return aux;
    }
    
    public Candidato getMaiorIdade(List<Candidato> candidatos){
        Candidato aux = new Candidato();
        for(Candidato c: candidatos){
            if(aux.getIdade()<c.getIdade())
                aux=c;
        }
        return aux;
    }
    public Candidato getMenorIdade(List<Candidato> candidatos){
        Candidato aux = getMaiorIdade(candidatos);
        for(Candidato c: candidatos){
            if(aux.getIdade()>c.getIdade())
                aux=c;
        }
        return aux;
    }
    
   public double getMediaIdade(List<Candidato> candidatos){
       double total=0;
       for(Candidato c: candidatos){
           total+=c.getIdade();
       }
       return total/candidatos.size();
   }
}
