package ex2;

/**
 * Repr�sente un livret A avec un solde et un taux de r�mun�ration annuel.
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de r�mun�ration annuel
     */
    private double tauxRemuneration;

    /**
     * Constructeur pour un livret A.
     *
     * @param solde            repr�sente le solde du compte
     * @param tauxRemuneration repr�sente le taux de r�mun�ration annuel
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * D�bite un montant du solde.
     *
     * @param montant le montant � d�biter
     * @throws IllegalArgumentException si le montant d�passe le solde disponible
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        } else {
            throw new IllegalArgumentException("Montant d�passe le solde disponible.");
        }
    }

    /**
     * Applique la r�mun�ration annuelle au solde.
     */
    public void appliquerRemunerationAnnuelle() {
        this.solde += this.solde * tauxRemuneration / 100;
    }

    /**
     * Getter pour le taux de r�mun�ration.
     *
     * @return le taux de r�mun�ration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter pour le taux de r�mun�ration.
     *
     * @param tauxRemuneration le taux de r�mun�ration � d�finir
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
