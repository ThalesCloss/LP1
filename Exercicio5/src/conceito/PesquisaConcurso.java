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
    
    public void infoCursos(){
        for(Curso c:cursos){
            System.out.println("===============================");
            System.out.println("Curso: "+c.getCodigoCurso()+" - "+c.getNomeCurso());
            System.out.println("Candidatos por vaga: "+c.getCandidatosVaga());
            System.out.println("% de candidatos masculino: "+c.getPercentualMasculino());
            System.out.println("% de candidatos feminino: "+c.getPercentualFeminino());
        }
    }
    
    public void cursoMaiorCandidatoVaga(){
        Curso maior = new Curso();
        for(Curso c:cursos){
            if(c.getCandidatosVaga()>maior.getCandidatosVaga())
                maior=c;
        }
        System.out.println("===============================");
        System.out.println("Curso com maior número de candidatos por vaga");
        System.out.println("Curso: "+maior.getCodigoCurso()+" - "+maior.getNomeCurso());
        System.out.println("Candidatos por vaga: "+maior.getCandidatosVaga());
    }
    
    public void totalCandidatos(){
        int total=0;
        for(Curso c:cursos){
            total+=c.getTotalCandidatos();
        }
        System.out.println("===============================");
        System.out.println("Total de candidatos: "+total);
    }
}
