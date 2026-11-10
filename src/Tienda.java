//Crea un programa en Java que gestione una tienda pequeña con un menú de 3 opciones:
//
//Comprar producto (elige entre Camisa por 20€ o Pantalón por 35€).
//
//Ver resumen (muestra cuántos artículos se han vendido y el total recaudado, además de un mensaje con operador ternario que diga "¡Buen día!" si se supera los 50€ o "Ventas bajas" si no).
//
//Salir.
//
//Debe controlar los errores si el usuario escribe letras en lugar de números en el menú
//

import java.util.Scanner;
import java.util.InputMismatchException;


public class Tienda {
    public static Scanner sc = new Scanner(System.in);
    static final String TIENDA = """
             =====TIENDA=====
             1. comprar producto
             2. ver resumen
             3. salir
            
            """;




public static void main(String[] args) {


    int opcion = 0;
    int precioTotal = 0;
    int contador = 0;
    final int precioCamisa = 30;
    final int precioPantalon = 35;


    do {
        try {
            System.out.println(TIENDA);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Quiere comprar una camisa o un pantalon(1/2)");
                    int compra = sc.nextInt();

                    if (compra == 1) {
                        System.out.println("el precio de la camisa  es de " + precioCamisa + " euros ");
                        contador = contador + 1;
                        precioTotal = precioTotal + precioCamisa;


                    } else if (compra == 2) {
                        System.out.println("el precio del pantalon es de " + precioPantalon + " euros ");
                        contador = contador + 1;
                        precioTotal = precioTotal + precioPantalon;

                    } else {
                        System.out.println();
                        System.out.println("La opcion no es valida");

                    }

                    break;

                case 2:
                    System.out.println("numero total de compras:" + contador);
                    System.out.println(" se hac acumulado " + precioTotal + " euros ");
                    break;

                case 3:
                    System.out.println();
                    System.out.println("saliendo de la tienda hasta pronto");
                    break;

                default:
                    System.out.println(" error debe ser una de las opciones posibles");
                    sc.nextLine();
                    break;


            }


        } catch (InputMismatchException ime) {
            System.out.println("Error el caracter introducido no es valido");
            System.out.println();
            sc.nextLine();

        }

    } while (opcion != 3);
sc.close();
}


}
