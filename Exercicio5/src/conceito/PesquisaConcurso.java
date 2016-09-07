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
public class PesquisaConcurso {
    private List<Curso> cursos;
    
    public PesquisaConcurso(){
        cursos=new ArrayList<Curso>();
    }
    
    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }
    
    public List<Curso> cursosDisponiveis(){
        return cursos;
    }
    
    
    public Curso cursoMaiorCandidatoVaga(){
        Curso maior = new Curso();
        for(Curso c:cursos){
            if(c.getCandidatosVaga()>maior.getCandidatosVaga())
                maior=c;
        }
        return maior;
    }
    
    public int totalCandidatos(){
        int total=0;
        for(Curso c:cursos){
            total+=c.getTotalCandidatos();
        }
        return total;
    }
}
