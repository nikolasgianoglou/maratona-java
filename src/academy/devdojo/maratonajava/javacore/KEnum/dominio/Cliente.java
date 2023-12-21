package academy.devdojo.maratonajava.javacore.KEnum.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;

    private TipoPagamento tipoPagamento;

    public Cliente(String nome, academy.devdojo.maratonajava.javacore.KEnum.dominio.TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", TipoClienteInt=" + tipoCliente.getVALOR() +
                ", TipoPagamento=" + tipoPagamento +
                '}';
    }
}
