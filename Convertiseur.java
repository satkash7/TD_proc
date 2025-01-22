import java.util.Scanner;

public class Convertiseur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le temps en secondes: ");
        int totalSecondes = scanner.nextInt();

        int heures = totalSecondes / 3600;
        int minutes = (totalSecondes % 3600) / 60;
        int secondes = totalSecondes % 60;

        System.out.printf("%d secondes correspondent à %d heures, %d minutes, et %d secondes.%n", totalSecondes, heures, minutes, secondes);
    }
}
