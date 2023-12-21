package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Nikolas";
        estudante01.idade = 24;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriel";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        ImpressoraEstudante imprimirEstudante = new ImpressoraEstudante();
        imprimirEstudante.imprime(estudante01);
        imprimirEstudante.imprime(estudante02);
        System.out.println("###########################");
        imprimirEstudante.imprime(estudante01);
        imprimirEstudante.imprime(estudante02);
        System.out.println("###########################");
        System.out.println(estudante01.nome);
        System.out.println(estudante02.nome);
    }
}
