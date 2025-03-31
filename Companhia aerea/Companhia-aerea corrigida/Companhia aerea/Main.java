import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorReserva gerenciador = new GerenciadorReserva();

        while (true) {
            System.out.println("\nBem Vindo a Sweet Flight");
            System.out.println("\n--MENU--");
            System.out.println("1 - Registrar Número de Aviões");
            System.out.println("2 - Registrar Assentos dos Aviões");
            System.out.println("3 - Reservar Passagem Aérea");
            System.out.println("4 - Consultar Reservas por Avião");
            System.out.println("5 - Consultar Reservas por Passageiros");
            System.out.println("6 - Encerrar");
            System.out.print("\nEscolha uma opção: ");

            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Quantos aviões deseja cadastrar? (Máximo 4): ");
                    int quantidadeAvioes = scanner.nextInt();
                    scanner.nextLine();

                    if (quantidadeAvioes > 4) {
                        System.out.println("Você só pode cadastrar no máximo 4 aviões!");
                        break;
                    }

                    for (int i = 0; i < quantidadeAvioes; i++) {
                        System.out.print("Digite o número do avião " + (i + 1) + ": ");
                        int numero = scanner.nextInt();
                        scanner.nextLine();
                        gerenciador.adicionarAviao(numero, 0);
                    }
                    break;

                case 2:
                    for (Aviao aviao : gerenciador.avioes) {
                        System.out.print("Digite a quantidade de assentos para o avião " + aviao.getNumeroAviao() + ": ");
                        int assentosDisponiveis = scanner.nextInt();
                        scanner.nextLine();
                        aviao.setAssentosDisponiveis(assentosDisponiveis);
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do avião: ");
                    int numeroAviao = scanner.nextInt();
                    scanner.nextLine();
                
                    System.out.print("Digite o nome do passageiro: ");
                    String passageiro = scanner.nextLine();
                
                    System.out.print("Quantos assentos deseja reservar? ");
                    int quantidadeAssentos = scanner.nextInt();
                    scanner.nextLine();
                
                    gerenciador.reservarPassagem(numeroAviao, passageiro, quantidadeAssentos);
                    break;

                case 4:
                    System.out.print("Digite o número do avião: ");
                    int numeroConsultaAviao = scanner.nextInt();
                    scanner.nextLine();
                    gerenciador.consultarReservasPorAviao(numeroConsultaAviao);
                    break;
                
                case 5:
                    System.out.print("Digite o nome do passageiro: ");
                    String nomeConsultaPassageiro = scanner.nextLine();
                    gerenciador.consultarReservasPorPassageiro(nomeConsultaPassageiro);
                    break;

                case 6:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}