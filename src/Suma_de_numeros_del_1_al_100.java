public class Suma_de_numeros_del_1_al_100 {
    public static void main(String[] args) {

        int total = 0;

        for(int i = 1; i <= 100 ; i ++){
            total = total + i;
        }

        System.out.println("La suma de los números del 1 al 100 es: " + total);
    }
}
