package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Falcao");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Pelé");
        Time time = new Time("Cruzeiro");
        jogador1.setTime(time);
        time.setJogadores(new Jogador[]{jogador1, jogador2, jogador3});

        System.out.println("------Jogador-------");

        jogador1.imprime();

        System.out.println("------Time-------");
        time.imprime();
    }
}
