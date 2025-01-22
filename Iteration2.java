
import java.util.Scanner;

public class Iteration2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Etrer un nombre entier positif: ");
        int nombre = scanner.nextInt();
        int somme = 0;
        int i = 0;

        while (somme < nombre) {
            i++;
            somme += i;
        }

        System.out.println("la somme des entiers naturel inferieur à " + nombre + " est: " + somme);
        scanner.close();
    }
}

