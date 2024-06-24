package ex2;

/**
 * Repr�sente un compte courant avec un solde et un d�couvert autoris�.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * decouvert : un d�couvert est autoris� pour les comptes courants
     */
    private double decouvert;

    /**
     * Constructeur pour un compte courant.
     *
     * @param solde     repr�sente le solde du compte
     * @param decouvert repr�sente le d�couvert autoris�
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /**
     * D�bite un montant du solde.
     *
     * @param montant le montant � d�biter
     * @throws IllegalArgumentException si le montant d�passe le d�couvert autoris�
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvert) {
            this.solde -= montant;
        } else {
            throw new IllegalArgumentException("Montant d�passe le d�couvert autoris�.");
        }
    }

    /**
     * Getter pour le d�couvert.
     *
     * @return le d�couvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter pour le d�couvert.
     *
     * @param decouvert le d�couvert � d�finir
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
