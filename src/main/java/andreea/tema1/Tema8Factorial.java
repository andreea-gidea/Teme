package andreea.tema1;


public class Tema8Factorial {
    public static void main(String[] args) {

        int n = 6;
        int nFactorial = 1;
        for (int i = 2; i <= n; i++) {
            nFactorial = nFactorial * i;
        }
        System.out.println(n + "!=" + nFactorial);
    }
}
