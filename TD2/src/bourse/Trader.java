/**
 * 
 */
package bourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 */
public class Trader implements Comparable<Trader> {
	private static final String PATTERN_IDENTIFIANT = "[A-Z 1-9]{1,}";
	private String identifiant;
	private String nom;
	private String ville;
	private List<Transaction> transactions;

	public Trader(String identifiant, String nom, String ville) {
		if (nom == null || ville == null) {
			throw new NullPointerException(
					"Le nom et la ville ne peuvent etre nul");
		}

		if (identifiant == null) {
			throw new NullPointerException("L'identifiant ne peut etre null");
		}

		if (!identifiant.matches(PATTERN_IDENTIFIANT)) {
			throw new IllegalArgumentException("Le pattern n'est pas respecté");
		}

		this.identifiant = identifiant;
		this.nom = nom;
		this.ville = ville;
		this.transactions = new ArrayList<>();
	}

	/**
	 * @return identifiant String
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant
	 *            :
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @return nom String
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            :
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return ville String
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville
	 *            :
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return transactions List<Transaction>
	 */
	public List<Transaction> getTransactions() {
		return Collections.unmodifiableList(transactions);
	}

	/**
	 * @param transactions
	 *            :
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		return this.identifiant.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trader other = (Trader) obj;
		if (identifiant == null) {
			if (other.identifiant != null)
				return false;
		} else if (!identifiant.equals(other.identifiant))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	@Override
	public int compareTo(Trader t) {
		return this.identifiant.compareTo(t.getIdentifiant());
	}

	public void addTransaction(Transaction t) {
		if (t == null) {
			throw new NullPointerException("la transaction ne peut etre nulle");
		}

		this.transactions.add(t);
	}
	
	@Override
	public String toString(){
		return "Trader [ identifiant="+this.getIdentifiant()+", nom="+this.getNom()+", ville="+this.getVille()+
				", transactions="+this.transactions+" ]";
	}/*
	private static final String PATTERN_IDENTIFIANT = "[A-Z 1-9]{1,}";
	private String identifiant;
	private String nom;
	private String ville;
	private List<Transaction> transactions;*/
}
