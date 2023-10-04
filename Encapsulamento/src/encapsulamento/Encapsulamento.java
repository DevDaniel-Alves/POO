package encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        /*
        c1.nome = "Marcos"; COM O NOME PUBLICO
        System.out.println("O nome é:" + c1.nome);*/
        /*
        c1.setNome("Daniel"); COM O NOME PRIVADO
        System.out.println("O nome é:" + c1.getNome());*/
        c1.nome = "Marcos";
    }

}
