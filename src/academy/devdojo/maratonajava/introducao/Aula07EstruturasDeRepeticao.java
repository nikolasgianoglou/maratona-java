package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 10;
        while(count < 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Do-while Executa pelo menos uma vez");
        } while (count<10);

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i < 50; i++) {
            if ( i > 25) {
                break;
            }
            System.out.println(i);
        }

        double valorParcela = 0.0;
        double valorCarro = 40000.0;
        for (int i = 1; i < valorCarro; i++) {
            valorParcela = valorCarro / i;
            System.out.println("Parcela do carro em " + valorParcela);
            if(valorParcela <= 1000) {
                break;
            }
        }
    }
}
