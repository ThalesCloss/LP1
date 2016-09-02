/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

/**
 *
 * @author DPPG01
 */
public class Curso {
    private int codigoCurso,numeroVagas=1,candidatosFeminino,candidatosMasculino;
    private String nomeCurso;

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public int getCandidatosFeminino() {
        return candidatosFeminino;
    }

    public void setCandidatosFeminino(int candidatosFeminino) {
        this.candidatosFeminino = candidatosFeminino;
    }

    public int getCandidatosMasculino() {
        return candidatosMasculino;
    }

    public void setCandidatosMasculino(int candidatosMasculino) {
        this.candidatosMasculino = candidatosMasculino;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public int getTotalCandidatos(){
        return candidatosFeminino+candidatosMasculino;
    }
    public double getPercentualMasculino(){
        return (Double.valueOf(candidatosMasculino*100))/getTotalCandidatos();
    }
    public double getPercentualFeminino(){
        return (Double.valueOf(candidatosFeminino*100))/getTotalCandidatos();
    }
    public double getCandidatosVaga(){
        return getTotalCandidatos()/Double.valueOf(numeroVagas);
    }
    
}
