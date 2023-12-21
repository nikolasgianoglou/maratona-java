package academy.devdojo.maratonajava.introducao;

public class Aula05OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Eu não vou doar";
        String resultado = salario > 6000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
