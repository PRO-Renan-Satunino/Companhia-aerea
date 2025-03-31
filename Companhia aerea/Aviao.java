
public class Aviao {
    private int numeroAviao;
    private int assentosDisponiveis;
    
    public Aviao(int numeroAviao, int assentosDisponiveis) {
        this.numeroAviao = numeroAviao;
        this.assentosDisponiveis = assentosDisponiveis;
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
    
    public boolean reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            return true;
        }
        return false;
    }
}
