import java.util.Scanner;

public class Procedure {
    
    public static void main(String[] args) {

        double a,b,c,delta;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer le coefficient de a: ");
        a = scanner.nextDouble();
        
        System.out.print("Entrer le coefficient de b: ");
        b = scanner.nextDouble();
        
        System.out.print("Entrer le coefficient de c: ");
        c = scanner.nextDouble();
        
        System.out.printf("L'équation est : %.2fx² + %.2fx + %.2f = 0%n", a, b, c);
        
        delta = calculeDiscriminant(a, b, c);
        Solutions(delta, a, b);
        
        scanner.close();
    }
    
    public static double calculeDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }
    
    public static void Solutions(double delta, double a, double b) {
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("L'équation comprends deux solutions : x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("L'équation comprends une double solutions: x = %.2f%n", x);
        } else {
            System.out.println("Solution complexe");
        }
    }
}

