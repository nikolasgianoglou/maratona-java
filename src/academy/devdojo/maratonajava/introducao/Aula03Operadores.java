package academy.devdojo.maratonajava.introducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int soma = 10+20;
        int subtraction = 10-20;
        System.out.println(soma);
        System.out.println(subtraction);

        // < > <= >= == !=
        // Operadores lógicos: && || !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float precoPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > precoPlaystation || valorTotalContaPoupanca > precoPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1000;
        System.out.println(bonus);

        //Incrementadores
        int contador = 1;
        contador++;
        System.out.println(contador);
    }
}
