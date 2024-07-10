package br.com.cubosacademy.exerciciospoo.nono;

public abstract class Animal {
    private String cor;
    private String porte;

    public Animal (String cor, String porte) {
        this.cor = cor;
        this.porte = porte;
    }

    public abstract String emitirSom ();
    public abstract String mover (String direcao);
}
