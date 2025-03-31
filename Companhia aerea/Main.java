import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GerenciadorReserva gerenciador = new GerenciadorReserva();

        while (true) {
            System.out.println("\nBem Vindo a Sweet Flight");
            System.out.println("\n--MENU--");
            System.out.println("\n1 - Registrar Numero de Avioes");
            System.out.println("2 - Registrar assento dos avioes");
            System.out.println("3 - Reservar Passagem aerea");
            System.out.println("4 - Consultar Reservas por aviao");
            System.out.println("5 - Consultar reservas por passageiros");
            System.out.println("6 - Encerrar");
            System.out.println("\nESCOLHA UMA OPCAO: ");

            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Quantos avioes deseja cadastrar? (Maximo 4): ");
                    int quantidadeAvioes = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i<quantidadeAvioes; i++) {
                        System.out.println("Digite o numero do aviao " + (i+1) + ":");
                        int numero = scanner.nextInt();
                        int assentos = scanner.nextInt();

                    gerenciador.adicionarAviao(numero, 0);
                    }
                    break;
1
                case 2: 
                    for (Aviao aviao : gerenciador.avioes) {
                        System.out.println("Digite a quantidade de assentos para o aviao " + aviao.getNumeroAviao() + ": ");
                        int assentosDisponiveis = scanner.nextInt();
                        gerenciador.adicionarAviao(aviao.getNumeroAviao(), assentosDisponiveis);
                    }
                    break;

                case 3: 
                    System.out.println("Digite o numero do aviao: ");
                    int numeroAviao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o nome do passageiro: ");
                    String passageiro = scanner.nextLine();
                    gerenciador.reservarPassagem(numeroAviao, passageiro);
                    break;

                case 4: 
                    System.out.println("Digite o numero do aviao: ");
                    int numeroConsultaAviao = scanner.nextInt();
                    scanner.nextLine();

                    gerenciador.consultarReservasPorAviao(numeroConsultaAviao);
                    break;

                case 5: 
                    System.out.println("Digite o nome do passageiro: ");
                    String nomeConsultaPassageiro = scanner.nextLine();
                    gerenciador.consultarReservasPorPassageiro(nomeConsultaPassageiro);
                    break;
                
                case 6: 
                    System.out.println("Encerrar Programa.");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }
    }

}