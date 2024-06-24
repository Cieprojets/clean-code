package ex2;

/**
 * Représente un compte bancaire avec un solde.
 */
public abstract class CompteBancaire {

    /**
     * solde : solde du compte
     */
    protected double solde;

    /**
     * Constructeur pour un compte bancaire.
     *
     * @param solde représente le solde du compte
     */
    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un montant au solde.
     *
     * @param montant le montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde.
     *
     * @param montant le montant à débiter
     * @throws IllegalArgumentException si le montant ne peut pas être débité
     */
    public abstract void debiterMontant(double montant);

    /**
     * Getter pour le solde.
     *
     * @return le solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter pour le solde.
     *
     * @param solde le solde à définir
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }
}
