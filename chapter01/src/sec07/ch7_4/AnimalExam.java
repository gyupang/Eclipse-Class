package sec07.ch7_4;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();

		System.out.println("----------------------------------------");

		Animal animal = null;
		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();

		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
