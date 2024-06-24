package ex5;

public class Item {

    private String nom;
    private int poids;

    /**
     * Getter pour l'attribut nom
     *
     * @return le nom de l'item
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom le nom à définir pour l'item
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut poids
     *
     * @return le poids de l'item
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Setter pour l'attribut poids
     *
     * @param poids le poids à définir pour l'item
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
