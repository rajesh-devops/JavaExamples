class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ArrayPolymorphismTest {
	public static void addAnimals(Animal[] animals){ //Animal[] animals = new Dog[3];
		animals[2] = new Dog();//ok
		animals[2] = new Cat(); //Compiled but throws ArrayStoreException. Hence arrays are protected at runtime.
	}	

	public static void main(String[] args) {
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog(); //Ok
		//dogs[1] = new Cat(); //Compilation error hence arrays are protected at compile time
		addAnimals(dogs);
		
		/*Cat[] cats = new Cat[3];
		cats[0] = new Cat(); //Ok
		//cats[1] = new Dog(); //Compilation error hence arrays are protected at compile time
		addAnimals(cats);
		*/

		/*
		Animal[] animals = new Animal[3];
		animals[0] = new Dog(); //Ok
		animals[1] = new Cat(); //Ok
		addAnimals(animals);
		*/
	}
}
