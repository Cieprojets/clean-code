package ex1;

/**
 * La classe Calcul fournit des opérations arithmétiques de base telles que l'addition et la soustraction.
 */
public class Calcul {

    /**
     * Ajoute deux entiers et retourne le résultat.
     *
     * @param a le premier entier
     * @param b le deuxième entier
     * @return la somme de a et b
     */
    public int addition(int a, int b) {
        return a + b;
    }

    /**
     * Soustrait le deuxième entier du premier et retourne le résultat.
     *
     * @param a le premier entier
     * @param b le deuxième entier
     * @return le résultat de la soustraction de b par a
     */
    public int soustraire(int a, int b) {
        return a - b;
    }
}
