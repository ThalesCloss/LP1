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
public class TurmaAluno {
    private List<Aluno> alunos;
    
    public TurmaAluno(){
        alunos=new ArrayList<Aluno>();
    }
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public Aluno maiorNota(){
        Aluno maior= new Aluno();
        for(Aluno a:alunos){
            if(a.calculaMedia()>maior.calculaMedia())
            {
                maior=a;
            }
        }
        System.out.println("============================");
        System.out.println("Maior nota: "+maior.calculaMedia());
        return maior;
    }
    
    public Aluno  menorNota(){
        Aluno menor= maiorNota();
        for(Aluno a:alunos){
            if(a.calculaMedia()<menor.calculaMedia())
            {
                menor=a;
            }
        }
        System.out.println("============================");
        System.out.println("Menor nota: "+menor.calculaMedia());
        return menor;
    }
    
    public void mediaTurma(){
        double media=0;
        for(Aluno a:alunos){
            media+=a.calculaMedia();
        }
        media=media/alunos.size();
        System.out.println("============================");
        System.out.println("Média da turma: "+media);
    }
    
    public void totalReprovados(){
        int total=0;
        for(Aluno a:alunos){
            if(!a.aprovado())
                total++;
        }
        System.out.println("============================");
        System.out.println("Total reprovados: "+total);
    }
    
    public void percentualReprovadosFalta(){
        int total=0;
        for(Aluno a:alunos){
            if(!a.aprovadoFrequencia())
                total++;
        }
        System.out.println("============================");
        System.out.println("Percentual reprovados por falta: "+(total*100)/alunos.size());
    }
    public void infoAlunos(){
        for(Aluno a:alunos){
            System.out.println("============================");
            System.out.println("Matricula: "+a.getMatricula());
            System.out.println("Média: "+a.calculaMedia());
            System.out.println("Frequencia: "+a.getFrequencia());
            System.out.println(a.aprovado()?"Aprovado":a.aprovadoFrequencia()?"Reprovado por média":"Reprovado por falta");
        }
        
    }
    
}
