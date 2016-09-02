/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Aluno;
import conceito.TurmaAluno;

/**
 *
 * @author DPPG01
 */
public class Principal {
    public static void main(String[] args) {
        TurmaAluno turma = new TurmaAluno();
        
        Aluno a1 = new Aluno();
        a1.setMatricula(1);
        a1.setFrequencia(85);
        a1.setN1(6);
        a1.setN2(5);
        a1.setN3(5.5);
        turma.adicionarAluno(a1);
        
        Aluno a2 = new Aluno();
        a2.setMatricula(1);
        a2.setFrequencia(72);
        a2.setN1(8);
        a2.setN2(8);
        a2.setN3(6);
        turma.adicionarAluno(a2);
        
        Aluno a3 = new Aluno();
        a3.setMatricula(1);
        a3.setFrequencia(90);
        a3.setN1(8);
        a3.setN2(8);
        a3.setN3(9);
        turma.adicionarAluno(a3);
        
        turma.maiorNota();
        turma.menorNota();
        turma.mediaTurma();
        turma.percentualReprovadosFalta();
        turma.totalReprovados();
        turma.infoAlunos();
    }
    
}
