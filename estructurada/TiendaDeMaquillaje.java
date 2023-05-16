
/**
 * Write a description of class Estudiante_Estructurada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;


public class TiendaDeMaquillaje {
 
    private int cantidadPaletasSombras = 0;
    private int cantidadBases = 0;
    private int cantidadBrillos = 0;
    private int cantidadPrimer = 0;
    private int cantidadRubor = 0;
    private int cantidadIluminador = 0;

    public void comprar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Digite su identificación: ");
        String identificacion = scanner.nextLine();

        int opcion;
        do {
            System.out.println("Digite la opcion que desea comprar:");
            System.out.println("1. Paleta de sombras");
            System.out.println("2. Base");
            System.out.println("3. Brillo");
            System.out.println("4. Primer");
            System.out.println("5. Rubor");
            System.out.println("6. Iluminador");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    cantidadPaletasSombras++;
                    break;
                case 2:
                    cantidadBases++;
                    break;
                case 3:
                    cantidadBrillos++;
                    break;
                case 4:
                    cantidadPrimer++;
                    break;
                case 5:
                    cantidadRubor++;
                    break;
                case 6:
                    cantidadIluminador++;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println("¿Desea seguir comprando? 1. Sí 2. No");
            opcion = scanner.nextInt();
        } while (opcion == 1);

        scanner.close();

        if (cantidadPaletasSombras > cantidadBases && cantidadPaletasSombras > cantidadBrillos
                && cantidadPaletasSombras > cantidadPrimer && cantidadPaletasSombras > cantidadRubor
                && cantidadPaletasSombras > cantidadIluminador) {
            System.out.println("Paleta de sombras es el producto más vendido con " + cantidadPaletasSombras + " unidades");
        } else if (cantidadBases > cantidadPaletasSombras && cantidadBases > cantidadBrillos
                && cantidadBases > cantidadPrimer && cantidadBases > cantidadRubor
                && cantidadBases > cantidadIluminador) {
            System.out.println("Base es el producto más vendido con " + cantidadBases + " unidades");
        } else if (cantidadBrillos > cantidadPaletasSombras && cantidadBrillos > cantidadBases
                && cantidadBrillos > cantidadPrimer && cantidadBrillos > cantidadRubor
                && cantidadBrillos > cantidadIluminador) {
            System.out.println("Brillo es el producto más vendido con " + cantidadBrillos + " unidades");
        } else if (cantidadPrimer > cantidadPaletasSombras && cantidadPrimer > cantidadBases
                && cantidadPrimer > cantidadBrillos && cantidadPrimer > cantidadRubor
                && cantidadPrimer > cantidadIluminador) {
            System.out.println("Primer es el producto más vendido con " + cantidadPrimer + " unidades");
        } else if (cantidadRubor > cantidadPaletasSombras && cantidadRubor > cantidadBases
                && cantidadRubor > cantidadBrillos && cantidadRubor > cantidadPrimer
                && cantidadRubor > cantidadIluminador) {
                }}}
    

