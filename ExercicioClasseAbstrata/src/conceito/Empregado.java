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
public abstract class Empregado extends Pessoa {
   private String nomeEmpresa, cargo;
   
   public Empregado(){
       this.nomeEmpresa="";
       this.cargo="";
   }
   
   public void setPessoa(Pessoa pessoa){
       this.setNome(pessoa.getNome());
       this.setNomePai(pessoa.getNomePai());
       this.setNomeMae(pessoa.getNomeMae());
   }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        if(nomeEmpresa.trim().length()>=3)
            this.nomeEmpresa = nomeEmpresa;
        else
            System.out.println("O nome da empresa deve possuir ao menos 3 caracteres");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(cargo.trim().length()>=3)
            this.cargo = cargo;
        else
            System.out.println("O nome deve possuir ao menos 3 caracteres");
    }
    
    public abstract double calcularSalario();
   
   
   
}
