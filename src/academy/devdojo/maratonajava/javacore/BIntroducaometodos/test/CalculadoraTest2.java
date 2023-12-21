package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
