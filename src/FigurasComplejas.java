import java.util.Scanner;

public class FigurasComplejas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrudce una palabra de una longitud impar");


        String frase = sc.nextLine().toUpperCase();
        int mitad = frase.length() /2;

        if (frase.length()% 2 ==0){
            System.out.println("Error debe de ser impar");
        } else {
            for (int i = 0; i <= mitad; i++) {
                for (int j = mitad - i; j > 0; j--) {
                    System.out.print(' ');
                    // Aquí dentro tendrás que usar 'i' para calcular qué trozo de cadena recortar o imprimir



                }
                String trozo = frase.substring(mitad - i, mitad + i + 1 );
                System.out.println(trozo);

            }
        }



    }




}
