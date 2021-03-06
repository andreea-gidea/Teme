package andreea.tema2;

import java.util.Scanner;

public class Tema2SmallersNumberInArrayForEachRefactored {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul numarul de numere de comparat");
        int n = scan.nextInt();
        int[] sir = getInts(scan, n);
        int min = getMin(sir);

        System.out.println("Minimul este  " + min);
    }

    public static int[] getInts(Scanner scan, int n) {
        int sir[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti elementul cu numarul  " + (i + 1));
            sir[i] = scan.nextInt();
        }
        scan.close();
        return sir;
    }

    public static int getMin(int[] sir) {
        int min;
        min = sir[0];
        for (int num2 : sir) {
            if (min > num2) {
                min = num2;
            }
        }
        return min;
    }
}
