public class Tableau3 {
    public static void main(String[] args) {
        int[][] matriceA = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] matriceB = {
            {16, 15, 14, 13},
            {12, 11, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}
        };

        System.out.println("Matrice A:");
        printMatrice(matriceA);
        
        System.out.println("Matrice B:");
        printMatrice(matriceB);
        
        int[][] transposeB = transpose(matriceB);
        int[][] resultat = multiplicationMatrices(matriceA, transposeB);
        
        System.out.println("Resultat de A * Transposé(B):");
        printMatrice(resultat);
    }

    public static void printMatrice(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrice) {
        int lignes = matrice.length;
        int colonnes = matrice[0].length;
        int[][] transpose = new int[colonnes][lignes];
        
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                transpose[j][i] = matrice[i][j];
            }
        }
        return transpose;
    }

    public static int[][] multiplicationMatrices(int[][] matriceA, int[][] matriceB) {
        int lignesA = matriceA.length;
        int colonnesA = matriceA[0].length;
        int lignesB = matriceB.length;
        int colonnesB = matriceB[0].length;
        
        if (colonnesA != lignesB) {
            throw new IllegalArgumentException("Les colonnes de la matrice A doivent correspondre aux lignes de la matrice B.");
        }

        int[][] result = new int[lignesA][colonnesB];
        
        for (int i = 0; i < lignesA; i++) {
            for (int j = 0; j < colonnesB; j++) {
                for (int k = 0; k < colonnesA; k++) {
                    result[i][j] += matriceA[i][k] * matriceB[k][j];
                }
            }
        }
        return result;
    }
}
