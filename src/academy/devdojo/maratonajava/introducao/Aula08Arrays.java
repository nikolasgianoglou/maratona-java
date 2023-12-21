package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // boolean false
        // String null
        // char '\u0000' -> ''
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 23;
        System.out.println(idades);
        //System.out.println(idades[3]);

        // Iterar sobre arrays
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[] {12,13,14,15};
        // utilizando o forEach
        for(int num: numeros3) {
            System.out.println(num);
        }
    }
}
