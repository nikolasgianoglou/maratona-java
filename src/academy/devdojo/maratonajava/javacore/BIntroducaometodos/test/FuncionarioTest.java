package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[] {10000, 11200, 13000});
        funcionario.imprimirDados();
        funcionario.imprimirMediaSalarios();
    }
}
