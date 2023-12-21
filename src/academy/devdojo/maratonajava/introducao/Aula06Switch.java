package academy.devdojo.maratonajava.introducao;

public class Aula06Switch {
    public static void main(String[] args) {
        byte dia = 6;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Dia semana");
                break;
            case 2:
                System.out.println("Dia semana");
                break;
            case 3:
                System.out.println("Dia semana");
                break;
            case 4: {
                System.out.println("Dia semana");
                break;
            }
            case 5:
                System.out.println("Dia semana");
                break;
            case 6:
            case 7:
                System.out.println("Final de semana");
            default: //posicao do default nao importa
                System.out.println("Opção inválida");
        }
    }
}
