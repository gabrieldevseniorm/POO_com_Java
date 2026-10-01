package concessionaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando um objeto carro
        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                2024,
                150000.00
        );

        int opcao;

        do {

            System.out.println("\n===== CONCESSIONÁRIA =====");
            System.out.println("1 - Alterar dados");
            System.out.println("2 - Retornar dados");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n===== ALTERAR DADOS =====");
                    System.out.println("1 - Alterar marca");
                    System.out.println("2 - Alterar modelo");
                    System.out.println("3 - Alterar ano");
                    System.out.println("4 - Alterar preço");
                    System.out.print("Escolha o dado que deseja alterar: ");

                    int alterar = scanner.nextInt();
                    scanner.nextLine();

                    switch (alterar) {

                        case 1:
                            System.out.print("Digite a nova marca: ");
                            String novaMarca = scanner.nextLine();
                            carro.setMarca(novaMarca);
                            System.out.println("Marca alterada com sucesso!");
                            break;

                        case 2:
                            System.out.print("Digite o novo modelo: ");
                            String novoModelo = scanner.nextLine();
                            carro.setModelo(novoModelo);
                            System.out.println("Modelo alterado com sucesso!");
                            break;

                        case 3:
                            System.out.print("Digite o novo ano: ");
                            int novoAno = scanner.nextInt();
                            carro.setAno(novoAno);
                            System.out.println("Ano alterado com sucesso!");
                            break;

                        case 4:
                            System.out.print("Digite o novo preço: ");
                            double novoPreco = scanner.nextDouble();
                            carro.setPreco(novoPreco);
                            System.out.println("Preço alterado com sucesso!");
                            break;

                        default:
                            System.out.println("Opção de alteração inválida!");
                    }

                    break;

                case 2:
                    carro.exibirDados();
                    break;

                case 3:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}