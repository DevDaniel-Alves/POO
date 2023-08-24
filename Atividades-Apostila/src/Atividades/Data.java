package Atividades;

public class Data {

    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void dataFormatada() {
        System.out.println("Data de Entrada: " + this.dia + "/" + this.mes + "/" + this.ano);
    }

}
