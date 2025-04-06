import java.util.Scanner;

public class Ej2_Par_o_Impar {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = leer.nextInt();

        if (numero %2 == 0){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        }
        leer.close();
    }
}
