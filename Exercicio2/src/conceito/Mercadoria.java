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
public class Mercadoria {
    private String nome;
    private float preco_compra,preco_venda;
    private int qtd_comprada,qtd_vendida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(float preco_compra) {
        this.preco_compra = preco_compra;
    }

    public float getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(float preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getQtd_comprada() {
        return qtd_comprada;
    }

    public void setQtd_comprada(int qtd_comprada) {
        this.qtd_comprada = qtd_comprada;
    }

    public int getQtd_vendida() {
        return qtd_vendida;
    }

    public void setQtd_vendida(int qtd_vendida) {
        this.qtd_vendida = qtd_vendida;
    }
   
    
}
