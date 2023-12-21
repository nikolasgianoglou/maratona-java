package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public void imprimir() {
        System.out.println("Titulo - "+titulo);
        if(alunos!=null) {
            for (Aluno aluno : alunos) {
                System.out.println("Nome - "+aluno.getNome());
            }
        }
        if(local!=null) {
            System.out.println("Local - "+local.getEndereco());
        }
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
