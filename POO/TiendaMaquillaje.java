
/**
 * Write a description of class Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TiendaMaquillaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paletaSombras = 0;
        int base = 0;
        int brillo = 0;
        int primer = 0;
        int rubor = 0;
        int iluminador = 0;
        int comprar = 0;

        System.out.print("Digite su Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Digite su Identificacion: ");
        String identificacion = scanner.nextLine();

        do {
            System.out.println("Digite la opcion que desea comprar:");
            System.out.println("1. Paleta de Sombras");
            System.out.println("2. Base");
            System.out.println("3. Brillo");
            System.out.println("4. Primer");
            System.out.println("5. Rubor");
            System.out.println("6. Iluminador");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                paletaSombras++;
            } else if (opcion == 2) {
                base++;
            } else if (opcion == 3) {
                brillo++;
            } else if (opcion == 4) {
                primer++;
            } else if (opcion == 5) {
                rubor++;
            } else if (opcion == 6) {
                iluminador++;
            }

            System.out.println("Quieres seguir comprando?");
            System.out.println("1. Si");
            System.out.println("0. No");
            comprar = scanner.nextInt();
        } while (comprar == 1);

        if (paletaSombras > base && paletaSombras > brillo && paletaSombras > primer && paletaSombras > rubor && paletaSombras > iluminador) {
            System.out.println("La paleta de sombras es el producto más vendido con " + paletaSombras + " unidades.");
        } else if (base > paletaSombras && base > brillo && base > primer && base > rubor && base > iluminador) {
            System.out.println("La base es el producto más vendido con " + base + " unidades.");
        } else if (brillo > paletaSombras && brillo > base && brillo > primer && brillo > rubor && brillo > iluminador) {
            System.out.println("El brillo es el producto más vendido con " + brillo + " unidades.");
        } else if (primer > paletaSombras && primer > base && primer > brillo && primer > rubor && primer > iluminador) {
            System.out.println("El primer es el producto más vendido con " + primer + " unidades.");
        } else if (rubor > paletaSombras && rubor > base && rubor > brillo && rubor > primer && rubor > iluminador) {
            System.out.println("El rubor es el producto más vendido con " + rubor + " unidades.");
        } else if (iluminador > paletaSombras && iluminador > base && iluminador > brillo && iluminador > primer && iluminador > rubor) {
            System.out.println("El iluminador es el producto más vendido con " + iluminador + " unidades.");
        }
    }
}

