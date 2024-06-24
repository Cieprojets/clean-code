package ex1;

import java.util.Date;

/**
 * La classe Entreprise repr�sente une entreprise avec ses informations de base.
 */
public class Entreprise {

    /**
     * Le capital maximum autoris� pour l'entreprise.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Le num�ro SIRET de l'entreprise.
     */
    public int siret;

    /**
     * Le nom de l'entreprise.
     */
    public String nom;

    /**
     * L'adresse de l'entreprise.
     */
    public String adresse;

    /**
     * La date de cr�ation de l'entreprise.
     */
    public Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        // Impl�mentation de la logique pour afficher le statut de l'entreprise
    }
}
