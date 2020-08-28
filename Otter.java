public class Otter extends Mammal{
	public Otter(int a, String n){
	   super(a,n);
	   this.trick = "breaking a shell with a rock";
	   this.food = "fish and shellfish";
	}	   
	public Otter(int a, String n, String f){
		super(a,n,f);
		this.trick = "breaking a shell with a rock";
	}
	public final void display(){
		System.out.println(this.name + " is a " + this.age + " year old otter that likes to eat " + this.food + " and likes to show off by " + this.trick);
	}
}
