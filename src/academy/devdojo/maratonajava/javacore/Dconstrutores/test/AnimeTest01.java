package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One punch Man", "TV", 13, "Ação");
        anime.init("Shinjeki no Kyojin", "TV", 13);
        anime.imprime();
    }
}
