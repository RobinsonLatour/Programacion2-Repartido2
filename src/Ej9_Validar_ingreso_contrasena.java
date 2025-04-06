import java.util.Scanner;

public class Ej9_Validar_ingreso_contrasena {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String contrasena = "java123";
        String ingreso = "";

        do {
            System.out.println("Ingresa tu contraseña:");
            ingreso = leer.nextLine();

            if (contrasena.equals(ingreso)) {
                System.out.println("¡Acceso correcto!");
            }else {
                System.out.println("Contraseña incorrecta");
            }
        }while (!contrasena.equals(ingreso));

        leer.close();
    }
}
