package academy.devdojo.maratonajava.introducao;

public class Aula09ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 23;
        dias[0][1] = 32;
        dias[1][0] = 542;
        dias[1][1] = 56;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("Usando um forEach");
        for (int[] arrayBase: dias) {
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }

        // Inicializacao de arrays multidimensionais
        int[][] arrayInt = new int[3][];
        int[] array = {1,2,3};
        arrayInt[0] = array;//new int[2];
        arrayInt[1] = new int[] {1,2,3,4};
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0,0,1},{1,1,0},{2,2,0,8,9,10}};
    }
}
