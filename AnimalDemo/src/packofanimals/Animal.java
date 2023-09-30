package packofanimals;

public class Animal {

	private  String name;

	private AnimalType type;

	public Animal(String name, AnimalType type) {
		this.name = name;
		this.type = type;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHerb() {
		if(type == AnimalType.HERB) {
			return true;
		}
		else {
			return false;
		}
	}
}
