import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 0 y 999");
        int numero = leer.nextInt();

        if (numero < 0 || numero > 999){
            System.out.println("El número ingresado debe estar dentro del rango de 0 a 999 ");
        }else if (numero < 10){
            System.out.println("El número tiene una cifra");
        }else if (numero < 100){
            System.out.println("El número tiene dos cifras");
        }else {
            System.out.println("El número tiene tres cifras ");
        }
        leer.close();
    }
}
