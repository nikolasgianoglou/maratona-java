package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;
    // 0 - Bloco de inicializacao estatico é executado quando a JVM carregar a classe, carregado apenas uma vez
    // 1- Alocado espaco em memoria para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado, é executado todas as vezes que esse objeto é criado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    // A inicializacao dos atributos do objeto ocorre antes do construtor ser executado
    public Anime() {
        for(int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
