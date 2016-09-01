/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.ComparadorPeso;
import conceito.Crianca;
import conceito.PesquisaCrianca;
import conceito.Sexo;
import javax.swing.JOptionPane;

/**
 *
 * @author tcloss
 */
public class Principal {
    public static void main(String[] args) {
        PesquisaCrianca criancas = new PesquisaCrianca();
        do{
            criancas.adicionarCrianca(new Crianca(
                    (Sexo) JOptionPane.showInputDialog(null, "Sexo?", "Escolha o sexo", JOptionPane.QUESTION_MESSAGE, null, Sexo.values(), Sexo.values()[0]), 
                    Double.parseDouble(JOptionPane.showInputDialog(null,"Peso?").replace(",", "."))));
        }while(JOptionPane.showConfirmDialog(null, "Cadastrar outra criança?","Continuar?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION);
        
        System.out.println("Percentual do sexo masculino "+(criancas.criancasPorSexo(criancas.getCriancas(),Sexo.MASCULINO).size()*100)/criancas.quantidadeCriancas()+" %");
        System.out.println("Percentual do sexo feminino "+(criancas.criancasPorSexo(criancas.getCriancas(),Sexo.FEMININO).size()*100)/criancas.quantidadeCriancas()+" %");
        if(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.MASCULINO).size()>0)
            System.out.println("Percentual do sexo masculino acima de 3.5 kg "+(criancas.criancasPorPeso(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.MASCULINO),3.5,ComparadorPeso.MAIOR).size()*100)/criancas.criancasPorSexo(criancas.getCriancas(), Sexo.MASCULINO).size()+" %");
        if(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.FEMININO).size()>0)
            System.out.println("Percentual do sexo feminino acima de 3.0 kg "+(criancas.criancasPorPeso(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.FEMININO),3.0,ComparadorPeso.MAIOR).size()*100)/criancas.criancasPorSexo(criancas.getCriancas(), Sexo.FEMININO).size()+" %");
        if(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.MASCULINO).size()>0)
            System.out.println("Percentual do sexo masculino abaixo de 2.5 kg "+(criancas.criancasPorPeso(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.MASCULINO),2.5,ComparadorPeso.MENOR).size()*100)/criancas.criancasPorSexo(criancas.getCriancas(), Sexo.MASCULINO).size()+" %");
        if(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.FEMININO).size()>0)
            System.out.println("Percentual do sexo feminino abaixo de 2.0 kg "+(criancas.criancasPorPeso(criancas.criancasPorSexo(criancas.getCriancas(), Sexo.FEMININO),2.0,ComparadorPeso.MENOR).size()*100)/criancas.criancasPorSexo(criancas.getCriancas(), Sexo.FEMININO).size()+" %");
        
        System.exit(0);
    }
}
