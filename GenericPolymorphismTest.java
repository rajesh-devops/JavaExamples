import java.util.ArrayList;
import java.util.List;

public class GenericPolymorphismTest {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //Compilation error hence Generics are protected at compile time
		//addAnimals(dogs); //not ok
		addDogs(dogs);
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat()); //Ok
		//cats.add(new Dog()); //Compilation error hence Generics are protected at compile time
		//addAnimals(cats); not ok
		addCats(cats);
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); //Ok
		animals.add(new Cat()); //Ok
		addAnimals(animals);
	}
	
	public static void addDogs(List<Dog> dogs){
		
	}
	public static void addCats(List<Cat> cats){
		
	}
	public static void addAnimals(List<Animal> animals){ //Animal[] animals = new Dog[3];
		
	}	
}
