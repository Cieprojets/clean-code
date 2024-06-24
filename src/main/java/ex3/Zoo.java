package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo avec une liste d'animaux.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    /**
     * Constructeur pour un zoo.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param nomAnimal     le nom de l'animal
     * @param typeAnimal    le type de l'animal (MAMMIFERE, POISSON, SERPENT, etc.)
     * @param comportement  le comportement de l'animal (HERBIVORE, CARNIVORE, etc.)
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux du zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Retourne la taille de la liste des animaux.
     *
     * @return le nombre d'animaux dans le zoo
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Getter pour le nom.
     *
     * @return le nom du zoo
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom.
     *
     * @param nom le nom à définir
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
