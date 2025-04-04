import java.util.Scanner;

public class Mayor_de_tres_numeros {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = leer.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = leer.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = leer.nextDouble();

        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("El mayor es el número: " + numero1);
        }else if (numero2 >= numero1 && numero2 >= numero3){
            System.out.println("El mayor es el número: " + numero2);
        } else {
            System.out.println("El mayor es el número: " + numero3);
        }
        leer.close();

    }
}
