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
public class EmpregadoComissionado extends Empregado{
    public double totalVenda, percentualComissao;
    
    public EmpregadoComissionado(){
        super();
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        if(totalVenda>0)
            this.totalVenda = totalVenda;
        else
            System.out.println("O total da venda deve ser maior que zero");
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if(percentualComissao>0)
            this.percentualComissao = percentualComissao;
        else
            System.out.println("O percentual da comissão deve ser maior que zero");
    }
    
    
    @Override
    public double calcularSalario() {
        return totalVenda*(percentualComissao/100)+totalVenda;
    }
    
}
