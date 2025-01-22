import java.util.Scanner;

public class Tableau1 {
    public static void main(String[] args) {
        double[] nombres = new double[10];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrer 10 nombres réels :");
        for (int i = 0; i < 10; i++) {
            nombres[i] = scanner.nextDouble();
        }
        
        double somme = 0;
        double produit = 1;
        
        for (double nombre : nombres) {
            somme += nombre;
            produit *= nombre;
        }
        
        double moyenne = somme / nombres.length;
        
        System.out.println("La somme: " + somme);
        System.out.println("Le produit: " + produit);
        System.out.println("La moyenne: " + moyenne);
        
        scanner.close();
    }
}
