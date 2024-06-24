package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur
     *
     * @param nom le nom de la caisse
     */
    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * V�rifie si la caisse peut accepter un item en fonction de son poids.
     *
     * @param item l'item � v�rifier
     * @return true si l'item peut �tre ajout� � la caisse, false sinon
     */
    public boolean accepteItem(Item item) {
        // Exemple de r�gles de v�rification (peut �tre ajust� selon les besoins)
        if (nom.equals("Petits objets") && item.getPoids() < 5) {
            return true;
        } else if (nom.equals("Moyens objets") && item.getPoids() >= 5 && item.getPoids() <= 20) {
            return true;
        } else if (nom.equals("Grands objets") && item.getPoids() > 20) {
            return true;
        }
        return false;
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return le nom de la caisse
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom le nom � d�finir pour la cais
