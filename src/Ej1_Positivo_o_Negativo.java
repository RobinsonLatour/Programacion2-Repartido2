import java.util.Scanner;

public class Ej1_Positivo_o_Negativo {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        double numero = leer.nextDouble();

        if (numero == 0) {
            System.out.println("El 0 es considerado un valor neutro");
        }else if (numero > 0){
            System.out.println("El número ingresado es positivo");
        }else {
            System.out.println("El número ingresado es negativo");
        }
        leer.close();
    }
}