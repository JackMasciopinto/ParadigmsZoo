import java.util.*;
public class ZooTest { 
	
	static void initCounts(HashMap<String,Integer> counts){
		counts.put("otter",0);
		counts.put("gorilla",0);
		counts.put("hawk",0);
		counts.put("eagle",0);
		counts.put("lizard",0);
		counts.put("alligator",0);
		int tot = 0;
	}
	public static ArrayList<Animal> setupAnimals(HashMap<String,Integer> counts){
	    //TODO
		ArrayList<Animal> alist = new ArrayList<Animal>();
		alist.add(new Otter(4,"Gidget"));
		alist.add(new Otter(2,"Olivia","salmon"));
		alist.add(new Gorilla(2,"George","apples"));
		counts.put("otter",2);
		return alist;
	}
	static Animal makeAnimal(int age, String species, String name){
		Animal a = new Otter(0,"","");
		switch(species){
			case "otter":
				Otter o =  new Otter(age,name);
				o.info();
				a = o;
				break;
			case "gorilla":
				Gorilla g =  new Gorilla(age,name);
				g.info();
				a = g;
				break;
			case "lizard":
				Lizard l = new Lizard(age,name);
				l.info();
				a = l;
				break;
			case "alligator":
				Alligator al = new Alligator(age,name);
				al.info();
				a = al;
				break;
			case "hawk":
				Hawk h = new Hawk(age, name);
				h.info();
				a = h;
				break;
			case "eagle":
				Eagle e = new Eagle(age,name);
				e.info();
				a = e;
				break;
		}
		return a;
	}
	static Animal makeAnimal(int age, String species, String name, String food){
		Animal a = new Otter(0,"","");
		switch(species){
			case "otter":
				Otter o =  new Otter(age,name,food);
				o.info();
				a = o;
				break;
			case "gorilla":
				Gorilla g =  new Gorilla(age,name,food);
				g.info();
				a = g;
				break;
			case "lizard":
				Lizard l = new Lizard(age,name,food);
				l.info();
				a = l;
				break;
			case "alligator":
				Alligator al = new Alligator(age,name,food);
				al.info();
				a = al;
				break;
			case "hawk":
				Hawk h = new Hawk(age, name, food);
				h.info();
				a = h;
				break;
			case "eagle":
				Eagle e = new Eagle(age,name, food);
				e.info();
				a = e;
				break;
		}
		return a;
	}
	static void addAnimal(String[] details, ArrayList<Animal> alist, HashMap<String,Integer> counts){
		int age = 0;
		String food = "";
		String species = details[0];
		String name = details[1];
		Animal a;
		if(details.length > 2){
			age = Integer.parseInt(details[2]);
		}
		if(details.length > 3){
			food = details[3];
			a = makeAnimal(age,species,name,food);
		} else {
			a = makeAnimal(age,species,name);
		
		}	
		alist.add(a);
		String word = a.getSpecies();
		int count = counts.containsKey(word) ? counts.get(word) : 0;
		counts.put(word, count + 1);
	}
	static void removeAnimal(String name, ArrayList<Animal> alist, HashMap<String,Integer> counts){
		int i = 0;
		String word;
		boolean flag = true;
		for(Animal a: alist){
			if(a.getName().equals(name)){
				word = a.getSpecies();
				System.out.println(name + " the " + word + " was removed from the zoo \n");
				alist.remove(new Integer(i));
				i -= 1;
				int count = counts.containsKey(word) ? counts.get(word) : 0;
				counts.put(word, count - 1);
				flag = false;
			}
			i++;
		}
		if(flag){
			System.out.println("Could not find animal " + name + "\n");
		}
	}
	static void displayAnimals(String name, ArrayList<Animal> alist) {
		int curr = 1;
		boolean flag = true;
		for(Animal a: alist){
			if(a.getName().equals(name)){
				flag = false;
				a.display();
			}
		}
		if(flag){
			System.out.println("Could not find animal " + name + "\n");
		}
	}

	static void printSummaryView(HashMap<String,Integer> counts){
		System.out.println("Summary:");
		for(String an : counts.keySet()){
			int count = counts.get(an);
			if(count > 0){
				System.out.println(count + " " + an + "(s)");	
			}
		}
		System.out.println("\n");
	}
	static void printVerboseList(ArrayList<Animal> alist){
		int count = 1;
		System.out.println("Verbose List of Animals with details:");
		System.out.println("\tName\tSpecies");
		for(Animal a: alist){
			System.out.println(count + ": " + a.toString());
			count += 1;
		}
		System.out.println("\n");
	}

	static String printOptions(){
		return "Options:\nAdd animal(add)\nDelete animal(delete)\nDisplay Animal(display)";
	}

	public static void main(String[]args) {
		  //TODO	
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,Integer> counts = new HashMap<String,Integer>();
		initCounts(counts);
		ArrayList<Animal> alist = setupAnimals(counts);
		printSummaryView(counts);
		printVerboseList(alist);
		String action = "";
		String details = "";
		while(true){
			System.out.println("Type exit at any time to exit the program");
			System.out.println(printOptions());
			System.out.print("\nSelect action: ");
			action = scan.nextLine();
			if(action.equals("add")){
				System.out.print("\nWhat animal would you like to add to the zoo ");
				details = scan.nextLine();
				String[] splitStr = details.trim().split("\\s+");
				if(splitStr.length < 2){
					System.out.println("Not enough args");
					continue;
				}
				System.out.println("");
				addAnimal(splitStr,alist, counts);
			}
			else if(action.equals("delete")){
				System.out.print("\nWhat animal would you like to remove from the zoo ");
				details = scan.nextLine();
				System.out.println("");
				removeAnimal(details,alist, counts);
			}
			else if(action.equals("display")){
				System.out.print("\nWhat animal would you like to display from the zoo ");
				details = scan.nextLine();
				System.out.println("");
				displayAnimals(details,alist);
			}
			else if(action.equals("verbose")){
				printVerboseList(alist);
			}
			else if(action.equals("exit")){
				break;
			}
			else {
				System.out.println("Invalid action");
			}
		}
		
	} // end of main function
}	
			
