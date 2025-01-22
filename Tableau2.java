import java.util.Scanner;

public class Tableau2 {
    public static void main(String[] args) {
        int[][] Tableau = {
            {31, 82, 33, 34, 35},
            {66, 27, 21, 23, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier au choix: ");
        int n = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < Tableau.length; i++) {
            for (int j = 0; j < Tableau[i].length; j++) {
                if (Tableau[i][j] == n) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Le nombre" + n + " est dans le tableau.");
        } else {
            System.out.println("Le nombre " + n + " n'est pas dans le tableau.");
        }
        
        System.out.println("Le tableau est :");
        for (int i = 0; i < Tableau.length; i++) {
            for (int j = 0; j < Tableau[i].length; j++) {
                System.out.print(Tableau[i][j]+ " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
