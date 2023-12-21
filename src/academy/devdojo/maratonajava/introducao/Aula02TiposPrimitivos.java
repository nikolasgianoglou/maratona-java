package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //byte, short, int, double, float, char, long, boolean
        int variavel = (int) 100000000000L;
        int idadeDoPai = 20;
        long bigNumber = 1000L;
        byte idadeByte = -128;
        double age = 64;
        boolean isTestable = true;
        char catactere = 'M';

        String nome = "Nikolas";
        System.out.println("A idade é " + age);
        System.out.println(catactere);
        System.out.println(variavel);
        System.out.println(nome);
    }
}
