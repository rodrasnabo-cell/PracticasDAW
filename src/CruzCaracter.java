import java.util.Scanner;

public class CruzCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el caracter que quieras usar");

        Character Caracter = sc.next().charAt(0);
        System.out.println("introduce la altura de tu cruz");
        int Altura = sc.nextInt();
        int Mitad = (Altura / 2) + 1;

        for (int i = 1; i <= Altura; i++) {
            for (int j = 1; j <= Altura; j++) {
                if (i != Mitad && j != Mitad) {
                    System.out.print("  ");

                } else {
                    System.out.print(Caracter + " ");

                }


            }
            System.out.println();
        }
        sc.close();

    }

}
