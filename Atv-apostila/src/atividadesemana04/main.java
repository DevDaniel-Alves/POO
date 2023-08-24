package atividadesemana04;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int apostila = 0;
        int livro = 0;

        System.out.println("Ver exercicios do Livro[1] ou da Apostila[2]");
        int q = n.nextInt();

        if (q == 2) {
            ExerciciosRevisaA.cabecalhoA();
            System.out.println("Qual Atividade Deseja Pesquisar? ");
            apostila = n.nextInt();
        }

        switch (apostila) {
            case 1 -> ExerciciosRevisaA.Imprime1();
            case 2 -> ExerciciosRevisaA.imprime2();
            case 3 -> ExerciciosRevisaA.imprime3();
            case 4 -> ExerciciosRevisaA.fatorial();
            case 5 -> ExerciciosRevisaA.fatorial();
            case 6 -> ExerciciosRevisaA.fibonacci();
            case 7 -> {
                System.out.println("Digite o valor: ");
                int x = n.nextInt();
                ExerciciosRevisaA.valorDeX(x);
            }
            case 8 -> {
                System.out.println("Digite o numero de linhas: ");
                int num = n.nextInt();
                ExerciciosRevisaA.forEncadeado(num);
            }
            default -> System.out.println("Digite o valor valido!!!!!!!!!!!");
        }

        if (q == 1) {
            ExerciciosRevisaL.cabecalhoB();
            System.out.println("Qual Atividade Deseja Pesquisar? ");
            livro = n.nextInt();
        }

        switch (livro) {
            case 1 -> {
                System.out.print("Valor do Produto: ");
                double produto = n.nextDouble();
                System.out.print("Valor do desconto: ");
                double desconto = n.nextDouble();
                ExerciciosRevisaL.prodDesconto(produto, desconto);
            }
                
            case 2 -> {
                System.out.print("Digite a quantidade de pontos do lider: ");
                int pontosLider = n.nextInt();
                System.out.print("Digite a quantidade de pontos do lanterna: ");
                int pontosLanterna = n.nextInt();
                ExerciciosRevisaL.pontosNecessarios(pontosLider, pontosLanterna);
            }
                
            case 3 -> {
                System.out.print("Valor Transacao: ");
                double valorT = n.nextDouble();
                System.out.print("Valor Venal: ");
                double valorV = n.nextDouble();
                System.out.print("Valor Imposto: ");
                double imposto = n.nextDouble();
                ExerciciosRevisaL.itbi(valorT, valorV, imposto);
            }
                
            case 4 -> {
                System.out.print("Nota 1: ");
                double n1 = n.nextDouble();
                System.out.print("Nota 2: ");
                double n2 = n.nextDouble();
                System.out.print("Trabalho: ");
                double t = n.nextDouble();
                ExerciciosRevisaL.mediaAluno(n1, n2, t);
            }
            case 5 -> {
                System.out.print("Sua idade: ");
                int idade = n.nextInt();
                System.out.print("Seu Sexo: ");
                char sexo = n.next().charAt(0);
                System.out.print("Anos de Contribuicao: ");
                int anoContri = n.nextInt();
                ExerciciosRevisaL.aposentadoria(idade, sexo, anoContri);
            }
            case 6 -> {
                System.out.print("Nome do produto: ");
                String nomeProd = n.next();
                System.out.print("Valor: ");
                double valProd = n.nextDouble();
                ExerciciosRevisaL.valorDesconto(nomeProd, valProd);
            }
            
            case 7 ->{
                ExerciciosRevisaL.resistencias();
            }
            
            case 8 -> ExerciciosRevisaL.login();
            
            case 9 -> ExerciciosRevisaL.tabuada();
            default -> System.out.println("Digite o valor valido!!!!!!!!!!!");
        }
    }

}
