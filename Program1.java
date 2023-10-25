// Loading integer n, and next printing lits of its aliquot (inclusively with 1 & n)

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Podaj liczbe calkowita: ");
        int liczba = s.nextInt();

        System.out.printf("Dzielnikiem liczby %d jest:%n", liczba);

        for (int dzielnik = 1; dzielnik <= liczba; dzielnik++) {
            if (liczba % dzielnik == 0) {
                System.out.println(dzielnik);
            }
        }
    }
}
