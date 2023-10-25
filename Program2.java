import java.util.Random;
import java.util.Scanner;

public class genscanprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insert and integer n: ");
        int n = scanner.nextInt();

        Random random = new Random();

        int[] histogram = new int[10];

        System.out.println("Generated integers: ");
        for (int i = 0; i < n; i++) {
            int liczba = random.nextInt(10);
            histogram[liczba]++;
            System.out.print(liczba + " ");
        }

        System.out.println("\nHistogram:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
