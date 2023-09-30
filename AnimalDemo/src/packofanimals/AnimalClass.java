package packofanimals;

import java.util.ArrayList;


public class AnimalClass {

	public static void main(String[] args) {

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		Animal a1 = new Animal("Tigar",AnimalType.CARN);
		animalList.add(a1);
		animalList.add(new Animal("Lion",AnimalType.HERB));
		animalList.add(new Animal("Bear",AnimalType.CARN));
		animalList.add(new Animal("Deer",AnimalType.HERB));
		animalList.add(new Animal("Monkey",AnimalType.HERB));
		
		ArrayList<String> herbList = getHerbList(animalList);
		System.out.println(herbList);
	}

	public static ArrayList<String> getHerbList(ArrayList<Animal> animalList) {
		ArrayList<String> herbList = new ArrayList<String>();

		for(Animal animal: animalList) {
			if(animal.isHerb() == true) {
				herbList.add(animal.getName());
				}
		}
		
			return herbList;
			

		
	}


}
