package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public final class Carro { //Quando aplicado a classes não permite que outras classes herdem ela
    private String nome;

    public final Comprador comprador = new Comprador(); //Ao adicionar o modificador final no nome da variável não é possível mudar a referencia
    public static final double VELOCIDADE_LIMITE; //Não pode trocar o valor depois de ser definida
    static {
        VELOCIDADE_LIMITE = 150;
    }

    public final void imprime() { //não pode ser sobrescrito quando é add o modificador final. Nesse caso nao faz sentido pq a classe já é final, nao pode herdar ela

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
