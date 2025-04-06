import java.util.Scanner;

public class Ej8_Sumar_N_numeros_positivos {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres sumar? ");

        double total = 0;
        int cuantos = leer.nextInt();
        int posicion = 1;

        if (cuantos <= 0){
            System.out.println("Debe ingresar una cantidad positiva");
        }else {
            while (cuantos >= 1) {
                System.out.println("Ingrese el " + posicion + "° número");
                posicion = posicion + 1;
                double numero = leer.nextDouble();
                total = total + numero;
                cuantos = cuantos - 1;
            }
            System.out.println("La suma total es: " + total);
        }
        leer.close();
    }
}
