public class Lizard extends Reptile{
    private String feature;
	public Lizard(int a, String n){
		super(a,n);
		this.food = "bugs";
		this.species = "lizard";
		this.feature = "clawed feat";
        this.consStatus = "not endangered";
	}
	public Lizard(int a, String n, String f){
		super(a,n,f);
		this.species = "lizard";
		this.feature = "clawed feet";
        this.consStatus = "not endangered";
	}
	public void display(){
		System.out.println(this.name + " is a " + this.age + " year old lizard that likes to eat " + this.food + " and needs sun and shade.\n");
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
