/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Mercadoria;
import conceito.Mercadorias;

/**
 *
 * @author tcloss
 */
public class principal {
    public static void main(String[] args) {
    Mercadorias mercadorias = new Mercadorias();
    
    Mercadoria mercadoria1 = new Mercadoria();
    
    mercadoria1.setNome("Joaozinho");
    mercadoria1.setPreco_compra(1000);
    mercadoria1.setPreco_venda(1500);
    mercadoria1.setQtd_comprada(100);
    mercadoria1.setQtd_vendida(100);
    
    mercadorias.adicionarMercadoria(mercadoria1);
    
    Mercadoria mercadoria2 = new Mercadoria();
    mercadoria2.setNome("Joaozinho edição safadinho");
    mercadoria2.setPreco_compra(3000);
    mercadoria2.setPreco_venda(4500);
    mercadoria2.setQtd_comprada(50);
    mercadoria2.setQtd_vendida(75);
    
    mercadorias.adicionarMercadoria(mercadoria2);
    
       
    Mercadoria mercadoria3 = new Mercadoria();
    mercadoria3.setNome("Joaozinho edição super safadinho");
    mercadoria3.setPreco_compra(4000);
    mercadoria3.setPreco_venda(5500);
    mercadoria3.setQtd_comprada(10000);
    mercadoria3.setQtd_vendida(50);
    
    mercadorias.adicionarMercadoria(mercadoria3);
    
        System.out.println("Mais comprada "+mercadorias.mercadoriaMaisComprada().getNome());
        System.out.println("Mais vendida "+mercadorias.mercadoriaMaisVendida().getNome());
        System.out.println("Menos comprada "+mercadorias.mercadoriaMenosComprada().getNome());
        System.out.println("Menos vendida "+mercadorias.mercadoriaMenosVendida().getNome());
        System.out.println("Valor total de venda "+mercadorias.valorTotalVenda());
        System.out.println("Valor total de compra "+mercadorias.valorTotalCompra());
        System.out.println("Lucro "+mercadorias.valorLucro());
    
    
    }
    
}
