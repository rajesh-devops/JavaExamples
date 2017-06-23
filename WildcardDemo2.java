import java.util.ArrayList;
import java.util.List;

public class WildcardDemo2 {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //Compilation error hence Generics are protected at compile time
		addAnimals(dogs); //ok
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat()); //Ok
		//cats.add(new Dog()); //Compilation error hence Generics are protected at compile time
		//addAnimals(cats); //not ok
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); //Ok
		animals.add(new Cat()); //Ok
		addAnimals(animals); //Ok
	}
	
	public static void addAnimals(List<? super Dog> animals){ //Allows List<Dog>, List<Animal>, List<Object> but not List<Cat>
		animals.add(new Dog()); //Ok
		//animals.add(new Cat()); //Compilation error
	}	
}
