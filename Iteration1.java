
import java.util.Scanner;

public class Iteration1 {
    public static void main(String[] args) {

        int N,NombreDepart;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer le nombre de départ: ");
        NombreDepart = scanner.nextInt();
        
        System.out.print("combien des nombres voulez-vous que le programme affiche ? :");
        N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(NombreDepart - i);
        }
        
        scanner.close();
    }
}
