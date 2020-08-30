public class Eagle extends Bird{
    private String feature;
	public Eagle(int a, String n){
		super(a,n);
		this.feature = "screech";
		this.food = "fish";
        this.species = "eagle";
        this.consStatus = "not endangered";
	}
	public Eagle(int a, String n, String f){
		super(a,n,f);
		this.feature = "screech";
		this.species = "eagle";
        this.consStatus = "not endangered";
	}
	public void display(){
		System.out.println(this.name + " is a " + this.age + " year old eagle that likes to eat " + this.food + " and can fly.\n");
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
