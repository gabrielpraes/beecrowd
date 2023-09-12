import java.io.IOException;
import java.util.Scanner;
 
/**
 * Produto Simples - BeeCrowd - #1004
 * @author Gabriel Praes
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("PROD = " + (num1 * num2));

        sc.close();
 
    }
 
}