package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

/**
 *    0 - Bloco de inicializacao estatico da classe pai é executado quando a JVM carregar a classe pai
 *    1 - Bloco de inicializacao estatico da sub classe pai é executado quando a JVM carregar a classe filha
 *    2- Alocado espaco em memoria para o objeto da super classe
 *    3 - Cada atributo de super classe é criado e inicializado com valores default ou o que for passado
 *    4 - Bloco de inicializacao da superclasse é executado na ordem que aparece
 *    5- Construtor é executado da super classe
 *    6 -  Alocado espaço em memoria para o objeto da subclasse
 *    7 - Cada atributo da subclasse é incializado com valores default ou o que for passado
 *    8 - Bloco de inicializacao da subclasse é executado na ordem que aparece
 *    9 - Construtor é executado da subclasse
 *

 */
public class HerancaTest01 {
    public static void main(String[] args) {
//        Endereco endereco = new Endereco();
//        endereco.setRua("Rua 3");
//        endereco.setCep("38412000");
//
//        Pessoa pessoa = new Pessoa("Nik");
//
//        Funcionario funcionario = new Funcionario("Nik");
//        funcionario.setEndereco(endereco);
//        funcionario.setNome("Nikolas");
//        funcionario.setCpf("12345678");
//        funcionario.setSalario(20000);
//        funcionario.imprime();
        Funcionario funcionario = new Funcionario("nome");
    }
}
