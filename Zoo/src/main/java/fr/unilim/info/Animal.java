package fr.unilim.info;

import java.util.Objects;

public class Animal {

	private String espece;
	private boolean carnivore;
	private float poids;
	
	public Animal(String espece, boolean carnivore, float poids){
		Objects.requireNonNull(espece, "L'espece ne peut etre nulle.");
		Objects.requireNonNull(carnivore, "Le champs carnivore ne peut etre nul.");
		Objects.requireNonNull(poids, "Le poids ne peut etre nul.");
		this.espece = espece;
		this.carnivore = carnivore;
		this.poids = poids;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public boolean isCarnivore() {
		return carnivore;
	}

	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (espece != other.espece)
			return false;
		if (carnivore != other.carnivore)
			return false;
		if (poids != other.poids)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return "Animal[espece="+this.espece+", carnivore="+this.carnivore+", poids="+this.poids+"]";
	}

}
