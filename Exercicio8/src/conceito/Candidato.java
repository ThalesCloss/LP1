/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

/**
 *
 * @author tcloss
 */
public class Candidato {
    private int numeroInscricao,idade;
    boolean experiencia;
    SexoCandidato sexo;

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isExperience() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public SexoCandidato getSexo() {
        return sexo;
    }

    public void setSexo(SexoCandidato sexo) {
        this.sexo = sexo;
    }
    
    
}
