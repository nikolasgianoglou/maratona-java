package academy.devdojo.maratonajava.javacore.CSobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.CSobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Shinjeki no Kyojin", "TV", 13);
        anime.imprime();
    }
}
