/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Consumidor;
import conceito.TipoConsumidor;
import conceito.VerificarConsumo;

/**
 *
 * @author DPPG01
 */
public class Principal {
    public static void main(String[] args) {
        VerificarConsumo consumo = new VerificarConsumo();
        
        Consumidor c1 = new Consumidor();
        c1.setNumeroConsumidor(1);
        c1.setQuntidadeKw(3500);
        c1.setTipo(TipoConsumidor.COMERCIAL);
        consumo.adicionarConsumidor(c1);
        
        Consumidor c2 = new Consumidor();
        c2.setNumeroConsumidor(2);
        c2.setQuntidadeKw(500);
        c2.setTipo(TipoConsumidor.RESIDENCIAL);
        consumo.adicionarConsumidor(c2);
        
        Consumidor c3 = new Consumidor();
        c3.setNumeroConsumidor(3);
        c3.setQuntidadeKw(13500);
        c3.setTipo(TipoConsumidor.INDUSTRIAL);
        consumo.adicionarConsumidor(c3);
        
        Consumidor c4 = new Consumidor();
        c4.setNumeroConsumidor(4);
        c4.setQuntidadeKw(3000);
        c4.setTipo(TipoConsumidor.COMERCIAL);
        consumo.adicionarConsumidor(c4);
        
        Consumidor c5 = new Consumidor();
        c5.setNumeroConsumidor(5);
        c5.setQuntidadeKw(200);
        c5.setTipo(TipoConsumidor.RESIDENCIAL);
        consumo.adicionarConsumidor(c5);
        
        Consumidor c6 = new Consumidor();
        c6.setNumeroConsumidor(6);
        c6.setQuntidadeKw(17500);
        c6.setTipo(TipoConsumidor.INDUSTRIAL);
        consumo.adicionarConsumidor(c6);
        
        
        System.out.println("Total consumido tipo Comercial em KW: "+consumo.totalConsumoKw(consumo.getConsumidoresPorTipo(TipoConsumidor.COMERCIAL)));
        System.out.println("Valor gasto pelo tipo comercial: "+consumo.totalConsumo(consumo.getConsumidoresPorTipo(TipoConsumidor.COMERCIAL),TipoConsumidor.COMERCIAL));
        System.out.println("Média KW consumido tipo Comercial: "+consumo.mediaConsumo(consumo.getConsumidoresPorTipo(TipoConsumidor.COMERCIAL)));
        System.out.println("==============================");
        System.out.println("Total consumido tipo Residencial: "+consumo.totalConsumoKw(consumo.getConsumidoresPorTipo(TipoConsumidor.RESIDENCIAL)));
        System.out.println("Valor gasto pelo tipo Residencial: "+consumo.totalConsumo(consumo.getConsumidoresPorTipo(TipoConsumidor.RESIDENCIAL),TipoConsumidor.RESIDENCIAL));
        System.out.println("Média KW consumido tipo Residencial: "+consumo.mediaConsumo(consumo.getConsumidoresPorTipo(TipoConsumidor.RESIDENCIAL)));
        System.out.println("==============================");
        System.out.println("Total consumido tipo Industrial: "+consumo.totalConsumoKw(consumo.getConsumidoresPorTipo(TipoConsumidor.INDUSTRIAL)));
        System.out.println("Valor gasto pelo tipo Industrial: "+consumo.totalConsumo(consumo.getConsumidoresPorTipo(TipoConsumidor.INDUSTRIAL),TipoConsumidor.INDUSTRIAL));
        System.out.println("Média KW consumido tipo Industrial: "+consumo.mediaConsumo(consumo.getConsumidoresPorTipo(TipoConsumidor.INDUSTRIAL)));
        
        for(Consumidor consumidor: consumo.getConsumidores()){
            System.out.println("==============================");
            System.out.println("Número: "+consumidor.getNumeroConsumidor());
            System.out.println("Tipo: "+consumidor.getTipo().toString());
            System.out.println("Total consumido: "+consumidor.getQuntidadeKw());
            System.out.println("Valor gasto: "+consumidor.totalPagar());
        }
    }
}
