import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Remover nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                nomes.add(nome);
                System.out.println("Nome cadastrado com sucesso.");

            } else if (opcao == 2) {
                if (nomes.isEmpty()) {
                    System.out.println("Nenhum nome cadastrado.");
                } else {
                    System.out.println("Lista de nomes:");
                    for (String n : nomes) {
                        System.out.println("- " + n);
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o nome para remover: ");
                String nome = sc.nextLine();

                if (nomes.contains(nome)) {
                    nomes.remove(nome);
                    System.out.println("Nome removido com sucesso.");
                } else {
                    System.out.println("Nome não encontrado.");
                }

            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
