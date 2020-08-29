public class Gorilla extends Mammal{
	private boolean silverback;
	public Gorilla(int a, String n){
		super(a,n);
		this.trick = "sign language";
		this.food = "fruits and veggies";
		this.species = "gorilla";
		this.consStatus = "endangered";
	}
	public Gorilla(int a, String n, String f){
		super(a,n,f);
		this.trick = "sign language";
		this.species = "gorilla";
		this.consStatus = "endangered";
	}
	public void display(){
		System.out.println(this.name + " is a " + this.age + " year old gorilla that likes to eat " + this.food + " and likes to use " + this.trick + " to communicate with zookeepers.\n");
	}
	public void setSilver(boolean s){
		silverback = s;
	}
	public boolean getSilver(){
		return silverback;
	}

	public void info(){
		genInfo();
		typeInfo();
		System.out.println("(optional) is silverback: " + this.silverback + "\n");		
	}
}
