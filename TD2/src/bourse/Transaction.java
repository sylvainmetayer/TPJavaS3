/**
 * 
 */
package bourse;

import java.util.Objects;

/**
 * Classe permettant de simuler le comportement d'une Transaction.<br>
 * Une transaction est composée d'une date et d'une valeur. <br>
 * De plus, les dates peuvent etre inférieures à une certaines date.
 * 
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 */
public class Transaction {

	/**
	 * Aucune transaction ne peut etre inférieure à cette année
	 */
	private static final int ANNEE_MIN = 2000;
	private int valeur;
	private int annee;

	/**
	 * Constructeur, qui permet de construire une {@link Transaction} en
	 * controlant les paramètres.
	 * 
	 * @param annee
	 *            {@link Integer}, correspondant à l'année de la transaction
	 * @param valeur
	 *            {@link Integer}, correspondant à la valeur de la transaction
	 * @throws NullPointerException
	 *             quand la valeur ou l'année de la transaction est nulle
	 * @throws IllegalArgumentException
	 *             quand la valeur de la transaction est inférieure à
	 *             {@link Transaction#ANNEE_MIN}
	 */
	public Transaction(int annee, int valeur) {
		Objects.requireNonNull(annee, "L'année ne peut etre nulle");
		Objects.requireNonNull(valeur, "La valeur ne peut etre nulle");

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
	 *            : La valeur de la {@link Transaction}
	 * @throws NullPointerException
	 *             quand valeur est nul
	 */
	public void setValeur(int valeur) {
		Objects.requireNonNull(valeur, "La valeur ne peut etre nulle");
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
	 *            : l'année de la {@link Transaction}
	 * @throws NullPointerException
	 *             quand annee est nul
	 * @throws IllegalArgumentException
	 *             quand la valeur de la transaction est inférieure à
	 *             {@link Transaction#ANNEE_MIN}
	 */
	public void setAnnee(int annee) {
		Objects.requireNonNull(annee, "L'année ne peut etre nulle");
		if (annee < Transaction.ANNEE_MIN) {
			throw new IllegalArgumentException("La date de la transaction ne peut etre inférieure à 2000 ");
		}

		this.annee = annee;
	}

	/**
	 * Retourne la valeur et l'année d'une {@link Transaction}
	 */
	@Override
	public String toString() {
		return "Transaction [ annee : " + this.annee + ", valeur : " + this.valeur + "]";
	}

}
