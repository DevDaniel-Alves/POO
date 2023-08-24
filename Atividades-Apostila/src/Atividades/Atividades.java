package Atividades;

public class Atividades {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        Data dataF1 = new Data(12, 12, 2012);
        Data dataF2 = new Data(30, 2, 2015);

        f1.nome = "Hugo";
        f1.departamento = "Contabilidade";
        f1.dataEntrada = dataF1;
        f1.rg = "234232";
        f1.salario = 1250.00;

        f2.nome = "Joao";
        f2.departamento = "TI";
        f2.dataEntrada = dataF2;
        f2.rg = "33333333";
        f2.salario = 1780.00;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        f1.mostra();
        f2.mostra();
    }

}
