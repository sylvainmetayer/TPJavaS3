package fr.unilim.info;

import java.util.ArrayList;
import java.util.Objects;

public class Zoo {

	private ArrayList<Animal> animaux;
	
	public Zoo() {
		this.animaux = new ArrayList<>();
	}

	public ArrayList<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(ArrayList<Animal> animaux) {
		this.animaux = animaux;
	}
	
	public void ajouterAnimal(Animal animal){
		if(animal == null)
			throw new IllegalArgumentException("L'animal n'existe pas...");
		this.animaux.add(animal);
	}
	
	public void retirerAnimal(Animal animal){
		if(animaux.contains(animal)){
			animaux.remove(animal);
		}
		else{
			throw new IllegalArgumentException("L'animal n'existe pas...");
		}
	}
	
	public boolean estVide(){
		return this.animaux.isEmpty();
	}
	
	@Override
	public String toString(){
		String animal = "";
		for(int i=0; i < this.animaux.size(); i++){
			animal += this.animaux.get(i)+"\n";
		}
		return animal;
	}

}
