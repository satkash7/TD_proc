import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {

        double nombre1,nombre2;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier nombre: ");
        nombre1 = scanner.nextDouble();
        
        System.out.print("Entrez le deuxieme nombre: ");
        nombre2 = scanner.nextDouble();
        
        System.out.print("entrer un operateur (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double resultat;
        
        switch (operator) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                resultat = nombre1 / nombre2;
                break;
            default:
                System.out.println("operateur invalide");
                return;
        }
        System.out.println("le resultat est :"+resultat+", son double est: " + (resultat * 2));
    }
}
