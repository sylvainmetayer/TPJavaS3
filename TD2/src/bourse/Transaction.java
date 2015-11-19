/**
 * 
 */
package bourse;

/**
 * 
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 */
public class Transaction {

	private static final int ANNEE_MIN = 2000;
	private int valeur;
	private int annee;

	public Transaction(int annee, int valeur) {
		if (annee < Transaction.ANNEE_MIN) {
			throw new IllegalArgumentException("Annee doit etre >= 2000");
		}

		this.annee = annee;
		this.valeur = valeur;
	}

	/**
	 * @return valeur {@link Integer}
	 */
	public int getValeur() {
		return valeur;
	}

	/**
	 * @param valeur
	 *            :
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * @return annee {@link Integer}
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee
	 *            :
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Transaction [ annee : " + this.annee + ", valeur : "
				+ this.valeur + "]";
	}

}
