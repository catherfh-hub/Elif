import java.util.Scanner;

public class Elif {
    static void main() {
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Debido. 2. Credito y 3 efectivo");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            System.out.println("Guarda dinero y Transferencia");
            System.out.println("Clonar Tarjeta");
            System.out.println("vaciar dinero");
            System.out.println("Robar Identidad");
            System.out.println("No generas historial crediticio");
        } else if (opcion == 2) {
            System.out.println("generas historial crediticio");
            System.out.println("puntos");
            System.out.println("cashback");
            System.out.println("es mas seguro");
        } if (opcion == 3) {
            System.out.println("tiene dinero en mano");
        } else if (opcion == 4) {
            System.out.println("opcion no valida");



        }
    }
}
