import java.util.ArrayList;

public class GerenciadorReserva {

     public ArrayList<Aviao>avioes = new ArrayList<>();
     private int totalReservas;

    public GerenciadorReserva() {
        avioes = new ArrayList<>();
        totalReservas = 0;
    }

    public void adicionarAviao(int numeroAviao, int assentosDisponiveis) {
        if(avioes.size() < 4) {
            Aviao aviao = new Aviao(numeroAviao, assentosDisponiveis);
            avioes.add(aviao);
        } else {
            System.out.println("Limite de avioes atingido.");
        }
    }

    public Aviao buscarAviao(int numeroAviao) {
        for (Aviao aviao : avioes) {
            if (aviao.getNumeroAviao() == numeroAviao) {
                return aviao;
            }
        }
        return null;
    }

    public void reservarPassagem(int numeroAviao, String passageiro, int quantidadeAssentos) {
        if (totalReservas >= 20) {
            System.out.println("Número máximo de reservas atingido!");
            return;
        }
    
        Aviao aviao = buscarAviao(numeroAviao);
        if (aviao == null) {
            System.out.println("Este avião não existe!");
        } else if (aviao.getAssentosDisponiveis() < quantidadeAssentos) {
            System.out.println("Não há assentos suficientes disponíveis para este avião!");
        } else {
            for (int i = 0; i < quantidadeAssentos; i++) {
                aviao.reservarAssento(passageiro);
            }
            totalReservas += quantidadeAssentos;
            System.out.println("Reserva realizada com sucesso!");
        }
    }

    public void consultarReservasPorAviao(int numeroAviao) {
        Aviao aviao = buscarAviao(numeroAviao);
        if (aviao == null) {
            System.out.println("Aviao nao encontrado.");
        } else if (aviao.getReservas().isEmpty()) {
            System.out.println("Sem reservas para este aviao.");
            } else {
                System.out.println("Reservas para o avião " + numeroAviao + ": " + aviao.getReservas());
            }
        }

        public void  consultarReservasPorPassageiro(String passageiro) {
            boolean encontrou = false;
            for (Aviao aviao : avioes) {
                if (aviao.getReservas().contains(passageiro)) {
                    System.out.println("Passageiro " + passageiro + " tem reserva no avião " + aviao.getNumeroAviao());
                    encontrou = true;
                }
            }
            if (!encontrou) {
                System.out.println("Não há reservas realizadas para este passageiro!");
            }
        }
    }
