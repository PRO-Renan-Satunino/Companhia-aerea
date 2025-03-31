import java.util.ArrayList;

public class GerenciadorReserva {
    protected ArrayList<Aviao> avioes = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private float MAX_RESERVA = 20;


    public void adicionarAviao(int numeroAviao, int assentos) {
        if(avioes.size() <= 4) {
            avioes.add(new Aviao(numeroAviao, assentos));
        } else {
            System.out.println("O numero de avioes foi excedido.");
        }
    }

    public Aviao buscarAviao(int numero) {
        for (Aviao aviao : avioes) {
            if (aviao.getNumeroAviao() == numero) {
                return aviao;
            }
        }
        return null;
    }

    public void reservarPassagem (int numeroAviao, String passageiro) {
        if(reservas.size() >= MAX_RESERVA) {
            System.out.println("Limite de Reservas atingido.");
            return;
        }

       Aviao aviao = buscarAviao(numeroAviao); {
        if (aviao == null) {
            System.out.println("Este aviao nao existe!");
            return;
        }
        if (aviao.reservarAssento()) {
            reservas.add(new Reserva(aviao, passageiro));
            System.out.println("Reservas realizadas com sucesso.");
        } else {
            System.out.println("Nao ha reservas disponiveis nesse aviao.");
        }
       }
    }

       public void consultarReservasPorAviao(int numeroAviao) {
        Aviao avioes = buscarAviao(numeroAviao); {
            if (avioes == null) {
                System.out.println("Este Aviao nao existe.");
                return;
            }

            boolean encontrou = false;
            for (Reserva reservas : reservas) {
                if (reservas.getAviao().getNumeroAviao() == numeroAviao) {
                    System.out.println("Passageiro: " + reservas.getPassageiro());
                    encontrou = true;
                }
            }

            if (!encontrou) { 
                System.out.println("Nao ha reservas realizadas para esse aviao.");
        }
    }
}

        public void consultarReservasPorPassageiro (String nomePassageiro){
            boolean encontrou = false;
            for (Reserva reserva : reservas) {
                if (reserva.getPassageiro().equalsIgnoreCase(nomePassageiro)) {
                    System.out.println("Aviao: " + reserva.getAviao().getNumeroAviao());
                    encontrou = true;
            }
        }
            if (!encontrou) {
                System.out.println("Nao ha Passageiros encontrados.");
            }
    }
}




