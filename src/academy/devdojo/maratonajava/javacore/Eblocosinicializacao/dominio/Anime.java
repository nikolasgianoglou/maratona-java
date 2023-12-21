package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    // 1- Alocado espaco em memoria para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado, é executado todas as vezes que esse objeto é criado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    // A inicializacao dos atributos do objeto ocorre antes do construtor ser executado
    public Anime() {
        System.out.println(episodios);
        for(int episodio: episodios) {
            System.out.print(episodio + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
