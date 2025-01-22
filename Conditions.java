import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        int a,b;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre positif ou negatif ");
        a = scanner.nextInt();

        System.out.print("Entrez un autre nombre positif ou negatif ");
        b =  scanner.nextInt();


        if (a * b < 0) {
            int temp = a;
            a = b;
            b = temp;
        } else {
            a = a * b;
            b = a + b;
        }

        System.out.println("valeur de a: " + a);
        System.out.println("valeur de b: " + b);
    }
}
