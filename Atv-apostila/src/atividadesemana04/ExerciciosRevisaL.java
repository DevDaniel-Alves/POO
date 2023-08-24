package atividadesemana04;

import java.util.Scanner;

public class ExerciciosRevisaL {
    public static void cabecalhoB(){
        System.out.println("============== MENU ==============");
        System.out.println("1 - Desconto do Produto");
        System.out.println("2 - Pontos Necessarios");
        System.out.println("3 - Transmissão de Bens Móveis (ITBI)");
        System.out.println("4 - Media Aluno");
        System.out.println("5 - Aposentadoria");
        System.out.println("6 - Valor Produto");
        System.out.println("7 - Resistencias");
        System.out.println("8 - Login e Senha");
        System.out.println("9 - Tabuada");
        System.out.println("==================================");
        System.out.println("");
    }
    
    
    public static void prodDesconto(double produto, double desconto){
        double totalDesconto = produto * desconto / 100;
        System.out.println("O valor do desconto e de R$: " + totalDesconto + " Reais");
    }
    
    public static void pontosNecessarios(int pontosLider, int pontosLanterna){
        int diferencaPontos = pontosLider - pontosLanterna;
        int vitoriasNecessarias = diferencaPontos / 3;
         System.out.println("O numero de vitorias necessarias e: " + vitoriasNecessarias);
    }
    
    public static void itbi(double valorT, double valorV, double imposto){
        double calculo = 0;
        if(valorT > valorV || valorT == valorV){
            calculo = valorT * imposto / 100;
            System.out.println("Valor do imposto: " + calculo);
        } else {
            calculo = valorV * imposto / 100;
            System.out.println("Valor do imposto: " + calculo);
        }
    }
    
    public static void mediaAluno(double n1, double n2, double t){
        double media = (n1 + n2 + t)/3;
        if(media >= 6){
            System.out.println("Media: " + media);
            System.out.println("Aprovado");
        }else{
            System.out.println("Media: " + media);
            System.out.println("Reprovado");
        }
    }
    
    public static void aposentadoria(int idade, char sexo, int anoContri){
        if(sexo == 'F' || sexo == 'f'){
            if(idade >= 60 && anoContri >= 30){
                System.out.println("voce ja tem o direito a aposentadoria");
            } else {
                int falta = 30 - anoContri ;
                System.out.println("Faltam so: " + falta + " Anos!");
            }
        }
        if(sexo == 'M' || sexo == 'm'){
            if(idade >= 65 && anoContri >= 35){
                System.out.println("voce ja tem o direito a aposentadoria");
            } else {
                int falta = 30 - anoContri;
                System.out.println("Faltam so: " + falta + " Anos!");
            }
        }
    }
    
    public static void valorDesconto(String nomeProd, double valProd){
        double desconto = 0;
        if(valProd >= 50 && valProd < 200){
            desconto = valProd * 5 / 100;
            System.out.println("o valor do desconto do produto "+ nomeProd + " e: "+ desconto);
        }
        if(valProd >= 200 && valProd < 500){
            desconto = valProd * 6 / 100;
            System.out.println("o valor do desconto do produto "+ nomeProd + " e: "+ desconto);
        }
        if(valProd >= 500 && valProd < 1000){
            desconto = valProd * 7 / 100;
            System.out.println("o valor do desconto do produto "+ nomeProd + " e: "+ desconto);
        }
        if(valProd >= 1000){
            desconto = valProd * 8 / 100;
            System.out.println("o valor do desconto do produto "+ nomeProd + " e: "+ desconto);
        }
    }
    
    public static void resistencias(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quatro valores:");

        double[] valores = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Resistencia " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double maiorValor = valores[0];
        double menorValor = valores[0];

        for (int i = 1; i < 4; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
            if (valores[i] < menorValor) {
                menorValor = valores[i];
            }
        }

        System.out.println("A maior Resistencia e: " + maiorValor);
        System.out.println("A menor Resistencia e: " + menorValor);
    }
    
    
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        final String login = "admin";
        final String pass = "123456";
        int tentativa = 3;
        String nome,senha;
        
        while(tentativa > 0){
            System.out.print("Login: ");
            nome = scanner.next();
            System.out.print("Senha: ");
            senha = scanner.next();
            
            if(nome.equals(login) && senha.equals(pass)){
                System.out.println("Login e senha aceitos!");
                break;
            }else {
                tentativa--;
                System.out.println("Falha, verifique login e senha!");
                System.out.println("Voce tem mais "+tentativa+" tentativa(s)!");
            }
        }       
    }
    
    public static void tabuada(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual tabuada deseja? ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + n * i);
        }
    }
}
