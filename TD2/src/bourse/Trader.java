/**
 * 
 */
package bourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
	/**
	 * Constructeur.
	 * @param identifiant String, nom String, ville String
	 * @throws NullPointerException
	 */
	public Trader(String identifiant, String nom, String ville) {
		Objects.requireNonNull(nom, "Le nom doit �tre renseign�");
		Objects.requireNonNull(ville, "La ville doit �tre renseign�e");
		Objects.requireNonNull(identifiant, "L'identifiant doit �tre renseign�");

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
	 * Setter permettant de modifier l'identifiant du trader
	 */
	public void setIdentifiant(String identifiant) {
		Objects.requireNonNull(identifiant, "L'identifiantt doit etre non nul");
		this.identifiant = identifiant;
	}

	/**
	 * @return nom String
	 * Accesseur retournant le nom du trader
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 * Setter modifiant le nom du trader
	 */
	public void setNom(String nom) {
		Objects.requireNonNull(nom, "Le nom doit etre non nul");
		this.nom = nom;
	}

	/**
	 * @return ville String
	 * Accesseur retournant le nom de la ville du trader
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville
	 * Setter permettant de modifier la ville du trader
	 */
	public void setVille(String ville) {
		Objects.requireNonNull(ville, "La ville doit etre non nulle");
		this.ville = ville;
	}

	/**
	 * @return transactions List<Transaction>
	 * Accesseur retournant la liste des transactions du trader
	 */
	public List<Transaction> getTransactions() {
		return Collections.unmodifiableList(transactions);
	}

	/**
	 * @param transactions
	 * Setter permettant de modifier la liste des transactions du trader
	 */
	public void setTransactions(List<Transaction> transactions) {
		Objects.requireNonNull(transactions, "Les transactions doivent etre non nulles");
		this.transactions = transactions;
	}
	/**
	 * @return hashcode int
	 * Retourne le hashcode d'un trader
	 */
	@Override
	public int hashCode() {
		return this.identifiant.hashCode();
	}

	/**
	 * @param Object
	 * @return equals boolean
	 * Retourne vrai si l'objet pass� en param�tre est �gal � l'objet courant, faux sinon
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trader trader = (Trader) obj;
		if(this.identifiant != trader.getIdentifiant())
			return false;
		if(this.nom != trader.getNom())
			return false;
		if(!this.ville.equals(trader.getVille()))
			return false;
		if(!this.transactions.equals(trader.getTransactions()))
			return false;
		return true;
	}
	/**
	 * @param Trader
	 * @return compareTo
	 * Retourne la comparaison entre un trader en param�tre et celui courant
	 */
	@Override
	public int compareTo(Trader t) {
		Objects.requireNonNull(t, "Le trader doit etre non nul");
		return this.identifiant.compareTo(t.getIdentifiant());
	}
	/**
	 * @param t
	 * Permet d'ajouter une transaction � la liste des transactions du trader
	 */
	public void addTransaction(Transaction t) {
		Objects.requireNonNull(t, "La transaction doit �tre renseign�e");

		this.transactions.add(t);
	}
	/**
	 * @return String
	 * Retourne le toString() du trader
	 */
	@Override
	public String toString(){
		return "Trader [ identifiant="+this.getIdentifiant()+", nom="+this.getNom()+", ville="+this.getVille()+
				", transactions="+this.transactions+" ]";
	}
}
