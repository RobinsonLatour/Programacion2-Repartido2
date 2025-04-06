import java.util.Scanner;

public class Ej5_IMC {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos:");
        double peso = leer.nextDouble();

        System.out.println("Ingrese su altura en metros");
        double altura = leer.nextDouble();

        if (peso <= 0 || altura <= 0){
            System.out.println("Error: la altura y el peso deben ser valores positivos");
        }else {

            double imc = peso / (altura * altura);

            if (imc < 18.5) {
                System.out.println("Bajo peso");
            } else if (imc < 25) {
                System.out.println("Normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }
        }
        leer.close();
    }
}
