public class ZooTest { 
	public static void setupAnimals(){
	    //TODO
		int numAnimals = 6;
		Animal[] alist = new Animal[2];
		alist[0] = new Otter(4,"Gidget");
		alist[1] = new Otter(2,"Olivia","salmon");
		/*alist[2] = new Shark("Jawsy");
		alist[3] = new Dog("Fido", “Black”, 1);
		alist[3].setAge(10);
		alist[4] = new Whale("Shamu");
		alist[5] = new Dog("Bagheera");*/
		System.out.println("\n");
		//printSummaryView(alist);
		printVerboseList(alist);
	}
	
	static Animal[] addAnimal(Animal a, Animal[] alist){
		alist.add(a);
	}
	static Animal[] deleteAnimal(int index, Animal[] alist){
		alist.remove(index);
	}
	static void displayAnimals(String name, Animal[] alist) {
		for(Animal a: alist){
			if(a.getName().equals(name)){
				a.display();
			}
		}
	}

	static void printSummaryView(Animal[] alist){
	}
	static void printVerboseList(Animal[] alist){
		for(Animal a: alist){
			a.display();
			System.out.println("");
		}
	}

	//static String printOptions(){ … }

	public static void main(String[]args) {
		  //TODO	
		  setupAnimals();
	} // end of main function
}	
			
