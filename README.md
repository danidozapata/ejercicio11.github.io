# Venta de Make Up
***Realizaremos el desarrollo de una aplicacion que nos permita evaluar el producto mas vendido segun los productos que tengamos disponibles en nuestra tienda.***

*Como informacion basica solicitaremos el nombre del cliente y la identificacion.*

## ***Aclaracion importante:***

- *Solicitaremos de nuestro proyecto calcular el producto mas vendido segun nuestro catalogo de Make Up.*
- *Para mantener la simplicidad del proyecto no se contemplan manejar persistencia en el almacenamiento de los datos.*
- *No se realiza validacion, ni se verifica calidad en los datos registrados.*
 
 
## ***Analisis del ejercicio:***

![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/6fe31925-b998-4baa-a490-b255176ff611)


## ***Aproximacion casos de uso:***

![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/eba73ae4-0897-4904-b835-40eef4ebd0db)


## ***Aproximacion diagrama de flujo:***

![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/4bdad138-05e2-4598-b86d-f20c2d904930)
![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/0cda295e-0dc8-4b19-803d-7a135417c707)
![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/5ea18168-796a-4b27-beff-bebb2d30bbd2)


## ***Aproximacion Seudocodigo:***


vint paletaSombras = 0;
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
