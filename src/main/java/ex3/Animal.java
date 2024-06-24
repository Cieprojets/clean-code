package ex3;

/**
 * Repr�sente un animal dans le zoo.
 */
public class Animal {

    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur pour un animal.
     *
     * @param nom          le nom de l'animal
     * @param type         le type de l'animal (MAMMIFERE, POISSON, SERPENT, etc.)
     * @param comportement le comportement de l'animal (HERBIVORE, CARNIVORE, etc.)
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter pour le nom.
     *
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom.
     *
     * @param nom le nom � d�finir
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour le type.
     *
     * @return le type de l'animal
     */
    public String getType() {
        return type;
    }

    /**
     * Setter pour le type.
     *
     * @param type le type � d�finir
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter pour le comportement.
     *
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter pour le comportement.
     *
     * @param comportement le comportement � d�finir
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    /**
     * Retourne une cha�ne de caract�res repr�sentant l'animal.
     *
     * @return une cha�ne de caract�res avec les informations de l'animal
     */
    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}
