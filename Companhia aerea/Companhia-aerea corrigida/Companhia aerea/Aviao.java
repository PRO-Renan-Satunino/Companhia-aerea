import java.util.ArrayList;

public class Aviao {
    private int numeroAviao;
    private int assentosDisponiveis;
    private ArrayList<String> reservas;
    
    public Aviao(int numeroAviao, int assentosDisponiveis) {
        this.numeroAviao = numeroAviao;
        this.assentosDisponiveis = assentosDisponiveis;
        this.reservas = new ArrayList<>();
    }

    
    public int getNumeroAviao() {
        return numeroAviao;
    }


    public void setNumeroAviao(int numeroAviao) {
        this.numeroAviao = numeroAviao;
    }


    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }


    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }


    public void setReservas(ArrayList<String> reservas) {
        this.reservas = reservas;
    }


    public ArrayList<String>getReservas() {
        return reservas;
    }

    public void reservarAssento(String passageiro) {
        if (assentosDisponiveis > 0) {
            reservas.add(passageiro);
            assentosDisponiveis--;
        }
    }
}

