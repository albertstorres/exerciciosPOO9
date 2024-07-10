package br.com.cubosacademy.exerciciospoo.nono;

public class Passaro extends Animal {
    private String raca;

    public Passaro (String cor, String porte, String racaPassaro) {
        super (cor, porte);
        this.raca = racaPassaro;
    }

    public String emitirSom () {
        return "PIU-PIU-PIU!";
    }
    public String mover (String direcao) {
        return "O pássaro voou para " + direcao;
    }
}
