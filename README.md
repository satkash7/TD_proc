# TD_proc
-ACHUNGE BATEGEJO.
-AGANZE CHIRIMWAMI.
-AGISHA WANI.
-AHABA BAHARANYI.
-AKONKWA BISIMWA.
-AKONKWA CHIKWANINE.
-ALFAJIRI NDABEREYE.
-AMANI KAHASHI.
-AMPIRE BISIMWA.

EXERCICE1 : Le programme commence par demander à l'utilisateur d'entrer un nombre de secondes (en utilisant scanner.nextInt()).
Heures : Le programme divise le nombre total de secondes par 3600 (le nombre de secondes dans une heure) pour obtenir le nombre d'heures.
Minutes : Après avoir extrait les heures, le reste des secondes (obtenu avec le modulo %) est divisé par 60 pour obtenir le nombre de minutes.
Secondes restantes : Le reste des secondes après avoir extrait les minutes est obtenu en utilisant l'opérateur modulo (% 60).
Le programme utilise System.out.printf pour afficher le résultat sous la forme :
<total> secondes correspondent à <heures> heures, <minutes> minutes, et <secondes> secondes.


EXERCICE2 : ce programme demande à l'utilisateur d'entrer deux nombres. Si ces nombres ont des signes opposés (l'un positif et l'autre négatif), il les échange. Sinon, il multiplie les deux nombres pour 
mettre à jour la valeur de a et ajoute les deux nombres pour mettre à jour la valeur de b. Enfin, il affiche les nouvelles valeurs de a et b.

EXERCICE3 : Le programme demande à l'utilisateur de saisir :
-Le premier nombre (nombre1).
-Le deuxième nombre (nombre2).
-Un opérateur arithmétique (+, -, *, /).
En fonction de l'opérateur choisi par l'utilisateur, une opération arithmétique est effectuée :
Si l'opérateur est +, il additionne les deux nombres.
Si l'opérateur est -, il soustrait le deuxième nombre du premier.
Si l'opérateur est *, il multiplie les deux nombres.
Si l'opérateur est /, il divise le premier nombre par le second.
Si l'opérateur n'est pas reconnu, le programme affiche un message d'erreur et arrête l'exécution.
Le programme affiche :
Le double de ce résultat (c'est-à-dire, deux fois le résultat).

EXERCICE4 : Le programme demande à l'utilisateur de saisir un nombre de départ (NombreDepart).
Il demande ensuite combien de nombres l'utilisateur veut que le programme affiche (N).
Une boucle for est utilisée pour afficher les valeurs :
La boucle commence à i = 1 et continue jusqu'à i <= N.
À chaque itération, le programme affiche NombreDepart - i.
Cela signifie qu'il commence par afficher NombreDepart - 1, puis NombreDepart - 2, et ainsi de suite.

EXERCICE5 : Le programme demande à l'utilisateur de saisir un nombre entier positif.
somme est initialisé à 0. Cette variable va accumuler la somme des entiers.
i est initialisé à 0. C'est le compteur qui va être incrémenté à chaque itération et ajouté à la somme.
Une boucle while est utilisée pour ajouter les entiers naturels (1, 2, 3, ...) à la somme :
La condition de la boucle est somme < nombre, donc tant que la somme est inférieure au nombre entré, la boucle continue.
À chaque itération de la boucle :
La variable i est incrémentée de 1.
La nouvelle valeur de i est ajoutée à somme.
La boucle s'arrête dès que la somme devient supérieure ou égale au nombre donné.
Une fois la boucle terminée, le programme affiche la somme des entiers naturels qui est inférieure au nombre donné.

EXERCICE6 : Le programme demande à l'utilisateur de saisir les trois coefficients de l'équation quadratique :
Le programme affiche l'équation sous la forme :
ax² + bx + c = 0 avec les valeurs arrondies à deux décimales.
Le discriminant est calculé avec la formule : delta = b²-4ac
Ce discriminant est ensuite utilisé pour déterminer le nombre et la nature des solutions de l'équation.
si
Δ>0 : L'équation a deux solutions réelles et distinctes. Les solutions sont calculées à l'aide de la formule :
Δ=0 : L'équation a une solution double (unique), donnée par :
Δ<0 : L'équation n'a pas de solutions réelles mais des solutions complexes. Le programme affiche "Solution complexe".

EXERCICE7 : Ce programme demande à l'utilisateur d'entrer 10 nombres réels et les stocke dans un tableau. Il calcule ensuite la somme de ces nombres en ajoutant chaque élément du tableau. Le produit est calculé en multipliant tous les éléments du tableau ensemble. La moyenne est obtenue en divisant la somme par la taille du tableau. Enfin, le programme affiche la somme, le produit et la moyenne des 10 nombres saisis

EXERCICE8 : Le tableau Tableau est prérempli avec des entiers dans une matrice 4x5.
Le programme demande à l'utilisateur de saisir un entier n à rechercher dans le tableau.
Le programme parcourt chaque élément du tableau en utilisant une double boucle for pour vérifier si le nombre n est présent dans le tableau. Si le nombre est trouvé, il met la variable found à true.
Après la recherche, le programme affiche si le nombre a été trouvé ou non dans le tableau.
Le programme affiche ensuite le contenu complet du tableau, ligne par ligne.

EXERCICE9 : Deux matrices 4x4 sont définies :
matriceA avec des entiers croissants de 1 à 16.
matriceB avec des entiers décroissants de 16 à 1.
Le programme affiche les matrices A et B en utilisant la méthode printMatrice.
La méthode transpose permet d'inverser les lignes et les colonnes de la matrice B. Par exemple, l'élément à la position (i, j) dans B devient l'élément (j, i) dans la matrice transposée.
La méthode multiplicationMatrices effectue la multiplication de la matrice A avec la matrice transposée de B :
La multiplication de matrices est effectuée lorsque le nombre de colonnes de A est égal au nombre de lignes de B.
Chaque élément du résultat est obtenu par la somme des produits des éléments correspondants des lignes de A et des colonnes de B.
Le résultat de la multiplication (matrice de taille 4x4) est affiché en utilisant à nouveau la méthode printMatrice.
