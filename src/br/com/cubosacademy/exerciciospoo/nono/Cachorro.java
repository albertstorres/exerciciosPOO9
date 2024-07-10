package br.com.cubosacademy.exerciciospoo.nono;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro (String cor, String porte, String raca) {
        super(cor, porte);
        this.raca = raca;
    }

    public String emitirSom () {
        return "AUAU!";
    }
    public String mover (String direcao) {
        return "O cachorro andou para " + direcao;
    }
}
