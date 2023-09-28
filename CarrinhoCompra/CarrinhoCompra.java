import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoCompra {
    private List<Item> itensList;

    public CarrinhoCompra() {
        this.itensList = new ArrayList<>();
    }

    public void adicionar(String nome, double preco, int qtd){
        itensList.add(new Item(nome, preco, qtd));
    }
    public void remover(){

    }
    public int calcular(){
        return itensList.size();
    }
    public void exibir(){
        if (!itensList.isEmpty()){
            System.out.println(itensList);
        }else {
            System.out.println("Seu carrinho não tem itens");
        }
    }
    public String menu(){
        return "0- sair\n1- Adicionar Itens\n2- Exibir meus Itens\n3- Remover Item\n4- Calcular quantidades de itens\n";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
CarrinhoCompra carrinho = new CarrinhoCompra();
int op;

do {
    System.out.print(carrinho.menu());
    System.out.print("Qual sua opção? ");
    op = scanner.nextInt();
    
    switch (op) {
        case 1:
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine(); // Consume the newline character
            nome = scanner.nextLine(); // Read the product name
            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            System.out.println("Digite a quantidade do produto: ");
            int qtd = scanner.nextInt();
            carrinho.adicionar(nome, preco, qtd);
            System.out.println("Item adicionado! :)");
            break;
        case 2:
            carrinho.exibir();
            break;
        case 3:
            carrinho.remover();
            break;
        case 4:
            carrinho.calcular();
            break;
        case 0:
            System.out.println("Saindo do programa. Adeus!");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
    }
} while (op != 0);
  scanner.close();
    }
}
