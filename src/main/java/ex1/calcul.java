package ex1;

/**
 * La classe Calcul fournit des op�rations arithm�tiques de base telles que l'addition et la soustraction.
 */
public class Calcul {

    /**
     * Ajoute deux entiers et retourne le r�sultat.
     *
     * @param a le premier entier
     * @param b le deuxi�me entier
     * @return la somme de a et b
     */
    public int addition(int a, int b) {
        return a + b;
    }

    /**
     * Soustrait le deuxi�me entier du premier et retourne le r�sultat.
     *
     * @param a le premier entier
     * @param b le deuxi�me entier
     * @return le r�sultat de la soustraction de b par a
     */
    public int soustraire(int a, int b) {
        return a - b;
    }
}
