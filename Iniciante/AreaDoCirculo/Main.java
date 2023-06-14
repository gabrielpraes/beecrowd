import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double X = sc.nextInt();
        double A = (X*X) * 3.14159;

        System.out.printf("A=%.4f", A);
        sc.close();
    }
}