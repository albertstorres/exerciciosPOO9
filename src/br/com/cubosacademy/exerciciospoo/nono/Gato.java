package br.com.cubosacademy.exerciciospoo.nono;

public class Gato extends Animal {
    private String raca;

    public Gato (String cor, String porte, String racaGato) {
        super (cor, porte);
        this.raca = racaGato;
    }

    public String emitirSom () {
        return "MIAU!";
    }
    public String mover (String direcao) {
        return "O gato andou para " + direcao;
    }
}
