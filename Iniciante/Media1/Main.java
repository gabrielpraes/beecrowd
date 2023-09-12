import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * Media 1 - BeeCrowd - #1005
 * @author Gabriel Praes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
        sc.close(); 
 
    }
 
}