package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
    // Construtores nao tem nenhum tipo de retorno
    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void init(String nome, String tipo, int episodios) {
        System.out.println("Dentro do metodo init");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        // Sobrecarga de métodos está relacionada aos parametros. Podem ser de tipos, quantidades ou nomes diferentes
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(genero);
        System.out.println(estudio);
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
