package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Nikolas");
        Escola escola = new Escola("Konoha");
        escola.setProfessores(new Professor[]{professor});
    }
}
