/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import conceito.Empregado;
import conceito.EmpregadoCLT;
import conceito.EmpregadoComissionado;
import conceito.EmpregadoHorista;
import conceito.Pessoa;
import conceito.TiposEmpregados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class principal {
    
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<Empregado>();
        String nome_empresa,cargo;
        int i=0;
        do{
            Pessoa p = new Pessoa();
            p.setNome(JOptionPane.showInputDialog(null, "Nome do empregado?"));
            p.setNomeMae(JOptionPane.showInputDialog(null,"Nome da mãe?"));
            p.setNomePai(JOptionPane.showInputDialog(null,"Nome do pai?"));
            TiposEmpregados tipo = (TiposEmpregados) JOptionPane.showInputDialog(null, "Tipo de empregado", "Selecione o tipo de empregado",JOptionPane.QUESTION_MESSAGE,null, TiposEmpregados.values(), TiposEmpregados.values()[0]);
            nome_empresa=JOptionPane.showInputDialog(null,"Nome da empresa?");
            cargo=JOptionPane.showInputDialog(null,"Cargo?");
            if(tipo==TiposEmpregados.CLT)
            {
             EmpregadoCLT empregado = new EmpregadoCLT();
             empregado.setPessoa(p);
             empregado.setNomeEmpresa(nome_empresa);
             empregado.setCargo(cargo);
             empregado.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog(null,"Valor do salário base?").replace(".", ";").replace(",", ".").replace(";", ".")));
             empregado.setNumeroFilho(Integer.parseInt(JOptionPane.showInputDialog(null,"numero de filhos?")));
             empregado.setValorSalarioFamilia(Double.parseDouble(JOptionPane.showInputDialog(null,"Valor do salário familia?").replace(".", ";").replace(",", ".").replace(";", ".")));
             empregado.setpINSS(Double.parseDouble(JOptionPane.showInputDialog(null,"Percentual do INSS %?").replace(",", ".")));
             empregado.setpIR(Double.parseDouble(JOptionPane.showInputDialog(null,"Percentual do IR %?").replace(",", ".")));
             empregados.add(empregado);
            }
            else if(tipo==TiposEmpregados.COMISSIONADO){
                EmpregadoComissionado comissionado = new EmpregadoComissionado();
                comissionado.setPessoa(p);
                comissionado.setNomeEmpresa(nome_empresa);
                comissionado.setCargo(cargo);
                comissionado.setTotalVenda(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total de venda?").replace(",", ".")));
                comissionado.setPercentualComissao(Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual da comissão?").replace(",", ".")));
                empregados.add(comissionado);
            }
            else if (tipo==TiposEmpregados.HORISTA){
                EmpregadoHorista horista = new EmpregadoHorista();
                horista.setPessoa(p);
                horista.setCargo(cargo);
                horista.setNomeEmpresa(nome_empresa);
                horista.setNumeroHora(Double.parseDouble(JOptionPane.showInputDialog(null, "Total de horas?").replace(",", ".")));
                horista.setValorHora((Double.parseDouble(JOptionPane.showInputDialog(null, "Valor por hora?").replace(",", "."))));
                empregados.add(horista);
            }
            i++;
        }
        while(i<2);
        for(Empregado e:empregados){
            System.out.println("Nome: "+e.getNome());
            System.out.println("Nome da mãe: "+e.getNomeMae());
            System.out.println("Nome do pai: "+e.getNomePai());
            System.out.println("Empresa: "+e.getNomeEmpresa());
            System.out.println("Cargo: "+e.getCargo());
            System.out.println("Salário: "+e.calcularSalario());
            System.out.println("===============================");
        }
        System.exit(0);
        
    }
    
}

