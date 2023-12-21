package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "BMW";
        carro.ano = "2021";
        carro.modelo = "320i";
        System.out.println(carro.nome +" "+ carro.ano + " " + carro.modelo);
    }
}
