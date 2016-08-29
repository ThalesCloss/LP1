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
public class Mercadorias {
    Mercadoria lista[];
    int posicao;
    public Mercadorias(){
        lista = new Mercadoria[100];
        posicao=0;
    }
    
    public void adicionarMercadoria(Mercadoria mercadoria){
        if(posicao<100)
        {
            lista[posicao]=mercadoria;
            posicao++;
        }
    }
    
    public Mercadoria mercadoriaMaisVendida(){
        Mercadoria mais_vendida =   new Mercadoria();
        for(int i=0;i<posicao;i++){
            if(lista[i].getQtd_vendida()>mais_vendida.getQtd_vendida())
                mais_vendida=lista[i];
        }
        return mais_vendida;
    }
    
    public Mercadoria mercadoriaMenosVendida(){
        Mercadoria menos_vendida = new Mercadoria();
        menos_vendida.setQtd_vendida(999999999);
        for(int i=0;i<posicao;i++){
            if(lista[i].getQtd_vendida()<menos_vendida.getQtd_vendida())
                menos_vendida=lista[i];
        }
        return menos_vendida;
    }
    
    public Mercadoria mercadoriaMaisComprada(){
        Mercadoria mais_comprada = new Mercadoria();

        for(int i=0;i<posicao;i++){
            if(lista[i].getQtd_comprada()>mais_comprada.getQtd_comprada())
                mais_comprada=lista[i];
        }
        return mais_comprada;
    }
    
    public Mercadoria mercadoriaMenosComprada(){
        Mercadoria menos_comprada = this.mercadoriaMaisComprada();
        for(int i=0;i<posicao;i++){
            if(lista[i].getQtd_comprada()<menos_comprada.getQtd_comprada())
                menos_comprada=lista[i];
        }
        return menos_comprada;
    }
    public float valorTotalVenda(){
        float venda=0;
        for(int i=0;i<posicao;i++){
            venda+=lista[i].getPreco_venda()*lista[i].getQtd_vendida();
        }
        return venda;
    }
    
    public float valorTotalCompra(){
        float compra=0;
        for(int i=0;i<posicao;i++){
            compra+=lista[i].getPreco_compra()*lista[i].getQtd_comprada();
        }
        return compra;
    }
    
    public float valorLucro(){
        return valorTotalVenda()-valorTotalCompra();
    }
    
}
