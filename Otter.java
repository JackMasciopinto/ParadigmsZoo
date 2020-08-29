public class Otter extends Mammal{
	private boolean isInfant;
	public Otter(int a, String n){
	   super(a,n);
	   this.species = "otter";
	   this.trick = "breaking a shell with a rock";
	   this.consStatus = "endangered";
	   this.food = "fish and shellfish";
	   if(this.age < 2){
		   isInfant = true;
		} else {
			isInfant = false;
		}

	}	   
	public Otter(int a, String n, String f){
		super(a,n,f);
		this.species = "otter";
	    this.consStatus = "endangered";
		this.trick = "breaking a shell with a rock";
	}
	public void setAge(int a){
		this.age = a;
		if(this.age < 2){
		   isInfant = true;
		} else {
			isInfant = false;
		}
	}
	public boolean getInfant(){ return isInfant; }
	public final void display(){
		System.out.println(this.name + " is a " + this.age + " year old otter that likes to eat " + this.food + " and likes to show off by " + this.trick + "\n");
	}
	public void info(){
		genInfo();
		typeInfo();
		System.out.println("(optional) is infant: " + this.isInfant + "\n");		
	}
}
