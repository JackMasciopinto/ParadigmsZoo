public abstract class Bird extends Animal{
    protected boolean canFly;
	Bird(int a, String n){
        super(a,n);
        this.repoMethod = "eggs";
		this.canFly = true;
    }
    Bird(int a, String n, String f){
        super(a,n,f);
        this.repoMethod = "eggs";
		this.canFly = true;
    }
    public abstract void display();
	public void setFlight(boolean flt){
		this.canFly = flt;
	}
	public boolean getFlight() {return canFly;}
    public void typeInfo(){
            System.out.println("(optional) can fly:" + this.canFly);
    }
}
