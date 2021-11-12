import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {


    ArrayList<Items> itens = new ArrayList<Items>();
    Scanner entrada = new Scanner(System.in);
    int removerItem;
    int id;

    public void cadastrar() {
        String nome;
        double preco;
        id = id + 1;

        System.out.println("Digite o seu nome : ");
        nome = entrada.next();
        System.out.println("Digite o seu preco : ");
        preco = entrada.nextDouble();

        Items item = new Items(id, nome, preco);
        itens.add(item);
    }

    public void mostrar() {
        if (itens.isEmpty()) {
            System.out.println("Lista Esta Vazia");
        } else {
            for (Items item : itens) {
                System.out.println("--------------------");
                System.out.printf("ID : %d\nNOME DO ITEM : %s\nPRECO DO ITEM : %.1f\n", item.id, item.nome, item.preco);
            }
        }

    }

    public void removerItem() {
        System.out.println("Informe qual o ID do item que deseja remover.");
        removerItem = entrada.nextInt();

        for (Items item : itens) {
            if (removerItem == item.id) {
                removerItem = removerItem - 1;
                itens.remove(removerItem--);
            }
        }
    }
}