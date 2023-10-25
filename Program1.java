// Loading integer n, and next printing lits of its aliquot (inclusively with 1 & n)

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class intfactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Insert and integer: ");
        int liczba = s.nextInt();

        System.out.printf("Factor of %d is:%n", liczba);

        for (int dzielnik = 1; dzielnik <= liczba; dzielnik++) {
            if (liczba % dzielnik == 0) {
                System.out.println(dzielnik);
            }
        }
    }
}
