package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Nikolas";
        estudante.idade = 27;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);

        Estudante emptyEstudante = new Estudante();
        System.out.println(emptyEstudante.nome);
        System.out.println(emptyEstudante.idade);
        System.out.println(emptyEstudante.sexo);
    }
}