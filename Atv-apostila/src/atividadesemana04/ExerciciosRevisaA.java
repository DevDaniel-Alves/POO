package atividadesemana04;


public class ExerciciosRevisaA {
    
    public static void cabecalhoA(){
        System.out.println("============== MENU ==============");
        System.out.println("1 - Imprime numeros de 150 a 300!");
        System.out.println("2 - Imprime a soma de 1 ate 1000!");
        System.out.println("3 - Imprime os multiplos de 3!");
        System.out.println("4 - Fatoriais de 1 a 10!");
        System.out.println("5 - Fatorial maior");
        System.out.println("6 - Imprime sequencia de Fibonnaci!");
        System.out.println("7 - Exercicio do x!");
        System.out.println("8 - For encadeado!");
        System.out.println("==================================");
        System.out.println("");
    }

    public static void Imprime1() {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
    }

    public static void imprime2() {
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }
        System.out.println("A soma e: " + soma);
    }

    public static void imprime3() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("3 X " + i + " = " + 3 * i);
        }
    }

    public static void fatorial() {
        long resultado = 1;
        for (int i = 2; i <= 10; i++) {
            resultado *= i;
            System.out.println("O fatorial de " + i + " e (" + (i - 1) + "!) *" + i + " = " + resultado);
        }
    }

    public static void fibonacci() {
        int num1 = 0, num2 = 1, nextTerm = 0;

        System.out.println("Os primeiros numeros da serie de Fibonacci sao:");
        System.out.print(num1 + " " + num2 + " ");

        while (nextTerm <= 100) {
            nextTerm = num1 + num2;
            if (nextTerm <= 100) {
                System.out.print(nextTerm + " ");
            }
            num1 = num2;
            num2 = nextTerm;
        }
    }

    public static void valorDeX(int x) {
        int valor = 0, i = 0;
        while (x != 1 && x > 0) {
            if (x % 2 == 0) {
                valor = x / 2;
                x = valor;
                System.out.print(x + " -> ");
            } else {
                valor = 3 * x + 1;
                x = valor;
                System.out.print(x + " -> ");
            }

        }
    }
    
    public static void forEncadeado(int n){       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
