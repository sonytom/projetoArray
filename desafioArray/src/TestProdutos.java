import java.util.ArrayList;
import java.util.Scanner;

public class TestProdutos {
    public static void main(String[] args) {

        Produtos produtos = new Produtos();
        int opcao;
        Scanner op = new Scanner(System.in);

        do {
            System.out.println("Escolha uma Opção");
            System.out.println("1 - Mostrar Produtos");
            System.out.println("2 - Para Cadastrar items");
            System.out.println("3 - Para Remover um Item");
            System.out.println("9 - Para Sair do Programa");
            opcao = op.nextInt();

            switch (opcao) {
                case 1:
                    produtos.mostrar();
                    break;
                case 2:
                    produtos.cadastrar();
                    break;
                case 3:
                    produtos.removerItem();
                    break;
                default:
                    System.out.println("Opcao invalida !!!");
            }
        } while (opcao != 0);
        System.out.println("Programa encerrado.");
    }
}



