//9 - ) Crie uma classe abstrata Animal com métodos abstratos para emitir som
// e se mover, e subclasses como Cachorro, Gato e Passaro.
import br.com.cubosacademy.exerciciospoo.nono.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro ("Preto", "Médio", "Labrador");
        Gato gato = new Gato ("Cinza", "Grande", "Não sei");
        Passaro passaro = new Passaro ("Amarelo", "Pequeno", "Canário");

        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.mover("Frente"));
        System.out.println(gato.emitirSom());
        System.out.println(gato.mover("Trás"));
        System.out.println(passaro.emitirSom());
        System.out.println(passaro.mover("Direita"));
    }
}