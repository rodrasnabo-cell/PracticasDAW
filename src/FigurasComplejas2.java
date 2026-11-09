import java.util.Scanner;

public class FigurasComplejas2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la altura del cuadrado");
        int Altura = sc.nextInt();


        for (int i = 1; i <=Altura; i++) {
            for (int j = 1; j <=Altura ; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
}