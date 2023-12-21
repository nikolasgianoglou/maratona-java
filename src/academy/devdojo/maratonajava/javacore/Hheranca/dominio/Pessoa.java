package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String cpf; //Dá acesso as variáveis da classe a todas subclasses e também as classes do mesmo pacote
    protected String nome;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicializacao estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicializacao 1 de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicializacao 2 de pessoa");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco.getRua());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
