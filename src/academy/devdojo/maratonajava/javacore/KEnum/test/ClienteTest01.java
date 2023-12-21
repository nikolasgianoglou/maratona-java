package academy.devdojo.maratonajava.javacore.KEnum.test;

import academy.devdojo.maratonajava.javacore.KEnum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.KEnum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.KEnum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Teste", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Teste", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
