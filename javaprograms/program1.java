// reads an integer n and prints list of its aliquots (inclusively with 1 & n)

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Insert integer: ");
        int liczba = s.nextInt();

        System.out.printf("Factor for %d is:%n", liczba);

        for (int dzielnik = 1; dzielnik <= liczba; dzielnik++) {
            if (liczba % dzielnik == 0) {
                System.out.println(dzielnik);
            }
        }
    }
}
