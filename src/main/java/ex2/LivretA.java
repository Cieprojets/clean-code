package ex2;

/**
 * Représente un livret A avec un solde et un taux de rémunération annuel.
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération annuel
     */
    private double tauxRemuneration;

    /**
     * Constructeur pour un livret A.
     *
     * @param solde            représente le solde du compte
     * @param tauxRemuneration représente le taux de rémunération annuel
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Débite un montant du solde.
     *
     * @param montant le montant à débiter
     * @throws IllegalArgumentException si le montant dépasse le solde disponible
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        } else {
            throw new IllegalArgumentException("Montant dépasse le solde disponible.");
        }
    }

    /**
     * Applique la rémunération annuelle au solde.
     */
    public void appliquerRemunerationAnnuelle() {
        this.solde += this.solde * tauxRemuneration / 100;
    }

    /**
     * Getter pour le taux de rémunération.
     *
     * @return le taux de rémunération
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter pour le taux de rémunération.
     *
     * @param tauxRemuneration le taux de rémunération à définir
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
