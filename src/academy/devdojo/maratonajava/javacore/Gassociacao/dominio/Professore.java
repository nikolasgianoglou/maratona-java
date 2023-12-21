package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professore {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professore(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome - "+nome);
        System.out.println("Especialidade - "+especialidade);
        if(seminarios!=null){
            for (Seminario seminario : seminarios) {
                System.out.println("Seminario - "+seminario.getTitulo());
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
