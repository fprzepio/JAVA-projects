//reads an integer n, generates n random integers within the range of [0,10), and then creates a histogram to visualize the data

import java.util.Random;
import java.util.Scanner;

public class histogram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insert an integer n: ");
        int n = scanner.nextInt();

        Random random = new Random();

        int[] histogram = new int[10];

        System.out.println("Generater integers: ");
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
