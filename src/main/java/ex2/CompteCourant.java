package ex2;

/**
 * Représente un compte courant avec un solde et un découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * decouvert : un découvert est autorisé pour les comptes courants
     */
    private double decouvert;

    /**
     * Constructeur pour un compte courant.
     *
     * @param solde     représente le solde du compte
     * @param decouvert représente le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /**
     * Débite un montant du solde.
     *
     * @param montant le montant à débiter
     * @throws IllegalArgumentException si le montant dépasse le découvert autorisé
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvert) {
            this.solde -= montant;
        } else {
            throw new IllegalArgumentException("Montant dépasse le découvert autorisé.");
        }
    }

    /**
     * Getter pour le découvert.
     *
     * @return le découvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter pour le découvert.
     *
     * @param decouvert le découvert à définir
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
