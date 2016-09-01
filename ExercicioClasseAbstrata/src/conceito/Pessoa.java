/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceito;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome, nomePai, nomeMae;
    
    public Pessoa(){
        nome="";
        nomePai="";
        nomeMae="";
    }
    public Pessoa(String nome){
        this();
        this.nome=nome;
    }
    
    public void setNome(String nome){
        if(nome.trim().length()>=3)
            this.nome=nome;
        else
            System.out.println("O nome deve possuir ao menos 3 caracteres");
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNomePai(String nomePai){
        if(nomePai.trim().length()>=3)
            this.nomePai=nomePai;
        else
            System.out.println("O nome do pai deve possuir ao menos 3 caracteres");
    }
    public String getNomePai(){
        return this.nomePai;
    }
    
    public void setNomeMae(String nomeMae){
        if(nomeMae.trim().length()>=3)
            this.nomeMae=nomeMae;
        else
            System.out.println("O nome da mãe deve possuir ao menos 3 caracteres");
    }
    
    public String getNomeMae(){
        return this.nomeMae;
    }
}
