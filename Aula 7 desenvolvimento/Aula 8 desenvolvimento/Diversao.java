import java.util.Scanner;

public class Diversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Capacidade máxima de 5 produtos
        String[] nomes = new String[5];
        int[] quantidades = new int[5];
        
        int qtd = 0; // Variável para controlar a quantidade de produtos cadastrados
        String opcao = "";

        // O laço do-while garante que o program rode até que "6" sega digitado
        do {
            System.out.println("\n=== SISTEMA DE ESTOQUE DA LOJA ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Pesquisar Produto");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Remover Produto");
            System.out.println("6 - Sair do Sistema");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\n--- CADASTRAR PRODUTO ---");
                    if (qtd < 5) {
                        System.out.print("Digite o nome do produto: ");
                        nomes[qtd] = sc.nextLine();
                        
                        System.out.print("Digite a quantidade em estoque: ");
                        quantidades[qtd] = sc.nextInt();
                        sc.nextLine(); // Limpar buffer do teclado
                        
                        qtd++; // Aumenta o contador de produtos cadastrados
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Capacidade máxima de 5 produtos atingida!");
                    }
                    break;

                case "2":
                    System.out.println("\n--- LISTA DE PRODUTOS ---");
                    if (qtd == 0) {
                        System.out.println("Newham produto cadastro no momento.");
                    } else {
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Índice: " + i + " | Produto: " + nomes[i] + " | Estoque: " + quantidades[i]);
                        }
                    }
                    break;

                case "3":
                    System.out.println("\n--- PESQUISAR PRODUTO ---");
                    System.out.print("Digite o nome do produto que deseja buscar: ");
                    String busca = sc.nextLine();
                    boolean encontradoBusca = false;

                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(busca)) {
                            System.out.println("Produto encontrado! Índice: " + i + " | Nome: " + nomes[i] + " | Quantidade: " + quantidades[i]);
                            encontradoBusca = true;
                            break;
                        }
                    }
                    if (!encontradoBusca) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case "4":
                    System.out.println("\n--- ALTERAR PRODUTO ---");
                    System.out.print("Digite o nome do produto que deseja alterar: ");
                    String alterar = sc.nextLine();
                    boolean encontradoAlterar = false;

                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(alterar)) {
                            System.out.print("Digite o NOVO nome do produto: ");
                            nomes[i] = sc.nextLine();
                            System.out.print("Digite a NOVA quantidade: ");
                            quantidades[i] = sc.nextInt();
                            sc.nextLine(); // Limpar buffer
                            
                            System.out.println("Produto alterado com sucesso!");
                            encontradoAlterar = true;
                            break;
                        }
                    }
                    if (!encontradoAlterar) {
                        System.out.println("Produto não encontrado para alteração.");
                    }
                    break;

                case "5":
                    System.out.println("\n--- REMOVER PRODUTO ---");
                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String remover = sc.nextLine();
                    boolean encontradoRemover = false;

                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(remover)) {
                            // Deslocar os elementos do array para a esquerda para cobrir o buraco
                            for (int j = i; j < qtd - 1; j++) {
                                nomes[j] = nomes[j + 1];
                                quantidades[j] = quantidades[j + 1];
                            }
                            
                            // Limpar a última posição preenchida
                            nomes[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;
                            
                            qtd--; // Reduz a quantidade total de produtos cadastrados
                            System.out.println("Produto removido com sucesso!");
                            encontradoRemover = true;
                            break;
                        }
                    }
                    if (!encontradoRemover) {
                        System.out.println("Produto não encontrado para remoção.");
                    }
                    break;

                case "6":
                    System.out.println("Encerrando o sistema da loja...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (!opcao.equals("6"));

        sc.close();
    }
}
