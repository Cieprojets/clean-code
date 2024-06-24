package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Ajoute un item à la caisse appropriée en fonction du poids.
     *
     * @param item l'item à ajouter
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepteItem(item)) {
                caisse.getItems().add(item);
                return; // On sort de la méthode dès qu'on ajoute l'item
            }
        }
        // Si aucun des caisses n'accepte l'item, on peut par exemple lever une exception
        throw new IllegalArgumentException("Aucune caisse ne peut accepter cet item : " + item.getNom());
    }

    /**
     * Calcule la taille totale des items dans toutes les caisses.
     *
     * @return la taille totale des items
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
