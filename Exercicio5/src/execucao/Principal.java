/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Curso;
import conceito.PesquisaConcurso;

/**
 *
 * @author DPPG01
 */
public class Principal {
    public static void main(String[] args) {
        PesquisaConcurso pesquisa = new PesquisaConcurso();
        
        Curso c1 = new Curso();
        c1.setCodigoCurso(10);
        c1.setNomeCurso("Engenharia da computação");
        c1.setNumeroVagas(27);
        c1.setCandidatosFeminino(75);
        c1.setCandidatosMasculino(20);
        
        pesquisa.adicionarCurso(c1);
        
        Curso c2 = new Curso();
        c2.setCodigoCurso(10);
        c2.setNomeCurso("Engenharia de controle");
        c2.setNumeroVagas(40);
        c2.setCandidatosFeminino(45);
        c2.setCandidatosMasculino(60);
        
        pesquisa.adicionarCurso(c2);
        
        Curso c3 = new Curso();
        c3.setCodigoCurso(10);
        c3.setNomeCurso("Engenharia de minas");
        c3.setNumeroVagas(35);
        c3.setCandidatosFeminino(15);
        c3.setCandidatosMasculino(80);
        
        pesquisa.adicionarCurso(c3);
        
        for(Curso c:pesquisa.cursosDisponiveis()){
            System.out.println("===============================");
            System.out.println("Curso: "+c.getCodigoCurso()+" - "+c.getNomeCurso());
            System.out.println("Candidatos por vaga: "+c.getCandidatosVaga());
            System.out.println("% de candidatos masculino: "+c.getPercentualMasculino());
            System.out.println("% de candidatos feminino: "+c.getPercentualFeminino());
        }
        pesquisa.cursoMaiorCandidatoVaga();
        pesquisa.totalCandidatos();
        
        Curso maior=pesquisa.cursoMaiorCandidatoVaga();
        System.out.println("===============================");
        System.out.println("Curso com maior número de candidatos por vaga");
        System.out.println("Curso: "+maior.getCodigoCurso()+" - "+maior.getNomeCurso());
        System.out.println("Candidatos por vaga: "+maior.getCandidatosVaga());
        
        System.out.println("===============================");
        System.out.println("Total de candidatos: "+pesquisa.totalCandidatos());
    }
    
}
