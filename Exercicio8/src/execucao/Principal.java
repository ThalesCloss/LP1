/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Candidato;
import conceito.ConsultaCandidato;
import conceito.SexoCandidato;

/**
 *
 * @author tcloss
 */
public class Principal {
    public static void main(String[] args) {
        ConsultaCandidato consulta = new ConsultaCandidato();
        
        Candidato c1 = new Candidato();
        c1.setNumeroInscricao(1);
        c1.setIdade(29);
        c1.setExperiencia(true);
        c1.setSexo(SexoCandidato.FEMININO);
        consulta.adicionarCandidato(c1);
        
        Candidato c2 = new Candidato();
        c2.setNumeroInscricao(1);
        c2.setIdade(18);
        c2.setExperiencia(false);
        c2.setSexo(SexoCandidato.MASCULINO);
        consulta.adicionarCandidato(c2);
        
        Candidato c3 = new Candidato();
        c3.setNumeroInscricao(1);
        c3.setIdade(25);
        c3.setExperiencia(true);
        c3.setSexo(SexoCandidato.FEMININO);
        consulta.adicionarCandidato(c3);
        
        Candidato c4 = new Candidato();
        c4.setNumeroInscricao(1);
        c4.setIdade(46);
        c4.setExperiencia(true);
        c4.setSexo(SexoCandidato.MASCULINO);
        consulta.adicionarCandidato(c4);
        
        Candidato c5 = new Candidato();
        c5.setNumeroInscricao(1);
        c5.setIdade(47);
        c5.setExperiencia(true);
        c5.setSexo(SexoCandidato.MASCULINO);
        consulta.adicionarCandidato(c5);
        
         Candidato c6 = new Candidato();
        c6.setNumeroInscricao(1);
        c6.setIdade(19);
        c6.setExperiencia(false);
        c6.setSexo(SexoCandidato.FEMININO);
        consulta.adicionarCandidato(c6);
        
        System.out.println("Número de candidatas "+consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.FEMININO).size());
        System.out.println("Número de candidatos "+consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.MASCULINO).size());
        
        System.out.println("Idade média de homens com experiência de serviço "+consulta.getMediaIdade(consulta.getCandidatosPorExperiencia(consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.MASCULINO), true)));
        System.out.println("% dos homens com mais de 45 anos entre o total de homens "+(consulta.getCandidatosPorFaixaEtaria(consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.MASCULINO), 45, 110).size()*100)/consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.MASCULINO).size()+" %");
        
        System.out.println("Número de mulheres com menos de 35 anos e experiência de serviço "+consulta.getCandidatosPorFaixaEtaria(consulta.getCandidatosPorExperiencia(consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.FEMININO), true), 0, 34).size());
        System.out.println("Menor idade entre mulheres com experiência de serviço "+consulta.getMenorIdade(consulta.getCandidatosPorExperiencia(consulta.getCandidatosPorSexo(consulta.getCandidatos(), SexoCandidato.FEMININO), true)).getIdade());
        
    }
}
