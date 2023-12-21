package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Nikolas";
        estudante01.idade = 24;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriel";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
