public class Hawk extends Bird{
    private String feature;
	public Hawk(int a, String n){
		super(a,n);
		this.feature = "sharp bill";
		this.food = "rodents";
        this.species = "hawk";
        this.consStatus = "not endangered";
	}
	public Hawk(int a, String n, String f){
		super(a,n,f);
		this.feature = "sharp bill";
		this.species = "rodents";
        this.consStatus = "not endangered";
	}
	public void display(){
		System.out.println(this.name + " is a " + this.age + " year old hawk that likes to eat " + this.food + " and can fly.\n");
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
