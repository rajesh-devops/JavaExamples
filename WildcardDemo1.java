import java.util.ArrayList;
import java.util.List;

public class WildcardDemo1 {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //Compilation error hence Generics are protected at compile time
		readAnimals(dogs); //ok
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat()); //Ok
		//cats.add(new Dog()); //Compilation error hence Generics are protected at compile time
		readAnimals(cats); //ok
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); //Ok
		animals.add(new Cat()); //Ok
		readAnimals(animals); //Ok
	}
	
	public static void readAnimals(List<? extends Animal> animals){ //Allows List<Dog>, List<Cat>, List<Animal>
		//animals.add(new Dog()); //wrong
		//animals.add(new Cat()); //wrong
	}	
}
