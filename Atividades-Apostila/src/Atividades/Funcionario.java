package Atividades;

public class Funcionario {

    String nome, departamento, rg;
    double salario, novoSalario;
    Data dataEntrada;

    void recebeAumento(double aumento) {
        novoSalario = this.salario + aumento;

        System.out.println("O salario atualizado e: " + novoSalario);
    }

    double calculaGanhoAnual() {
        double total = this.salario * 12;
        return total;
    }
    

    void mostra() {
        System.out.println("");
        System.out.println("===================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        //System.out.println("Dia: " + this.dataEntrada.dia);
        //System.out.println("Mes: " + this.dataEntrada.mes);
        //System.out.println("Ano: " + this.dataEntrada.ano);
        dataEntrada.dataFormatada(); // metodo da classe Data com a data de entrada formatada
        System.out.println("RG: " + this.rg);
        System.out.println("Salario: " + novoSalario);
        System.out.println("===================================");
        System.out.println("");
    }

}
