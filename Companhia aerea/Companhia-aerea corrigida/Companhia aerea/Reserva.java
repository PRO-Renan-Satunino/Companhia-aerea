public class Reserva {
    private Aviao aviao;
    private String passageiro;
    
    public Reserva(Aviao aviao, String passageiro) {
        this.aviao = aviao;
        this.passageiro = passageiro;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public String getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }

    
}
