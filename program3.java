//Life game 

import java.util.Random;
import java.util.Scanner;

public class lifegame {
    private static final int N = 10;

    public static void main(String[] args){
       boolean[][] tab = new boolean[N][N];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tab[i][j] = random.nextInt(10) < 3;
            }
        }

        while(true){
            print(tab);
            update(tab);
            scanner.nextLine();
        }
    }

public static void print(boolean[][] tab){
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if(tab[i][j]){
                System.out.print("X ");
            } else {
                System.out.print(". ");
            }
        }
        System.out.println();
    }
}

public static int licz(boolean[][] tab, int row, int cols) {
    int count = 0;
    for (int i = row - 1; i <= row + 1; i++) {
        for (int j = cols - 1; j < cols + 1; j++) {
            if(i == row && j == cols){
                continue;
            }
            if(i >= 0 && i < N && j >= 0 && j < N && tab[i][j]){
                count++;
            } 
        }
    }
    return count;
}

public static void update(boolean[][] tab){
    boolean[][] nowa = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int neighbor = licz(tab, i, j);
                if (tab[i][j]){
                    nowa[i][j] = neighbor == 2 || neighbor == 3;
                } else{
                    nowa[i][j] = neighbor == 3;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tab[i][j] = nowa[i][j];
            }
            
        }
    }
}
