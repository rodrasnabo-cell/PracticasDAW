import java.util.Scanner;

public class CuadradoDigitos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el mprimer valor de tu cuadrado");
        int N1 = sc.nextInt();
        System.out.println("intrpduce el segundo valor");
        int N2 = sc.nextInt();
        System.out.println("inroduce la altura ");
        int altura = sc.nextInt();

        for (int i = 1; i <=altura; i++) {
            for (int j = 1; j <= altura; j++){
               if (i ==1 || i == altura || j == 1 || j == altura){
                   if ((i + j) % 2 == 0 ) {
                       System.out.print(N1 + " ");
                   }else
                       System.out.print(N2 + " ");
                }else {
                   System.out.print("  ");

                }
                }
            System.out.println();

            }

        }
}
