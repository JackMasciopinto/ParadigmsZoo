public class Alligator extends Reptile{
    private String feature;
	public Alligator(int a, String n){
		super(a,n);
		this.feature = "dangerous bite";
		this.food = "fish and meat";
        this.species = "alligator";
        this.consStatus = "not endangered";
	}
	public Alligator(int a, String n, String f){
		super(a,n,f);
		this.feature = "dangerous bite";
		this.species = "alligator";
        this.consStatus = "not endangered";
	}
	public void display(){
		System.out.println(this.name + " is a " + this.age + " year old alligator that likes to eat " + this.food + " and needs sun and shade.\n");
	}
	public void setFeature(String s){
		feature = s;
	}
	public String getFeature(){
		return feature;
	}

	public void info(){
		genInfo();
		typeInfo();
		System.out.println("(optional) Unique feature: " + this.feature + "\n");		
	}
}
