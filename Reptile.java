public abstract class Reptile extends Animal{ 
	protected boolean tendsEggs;
	Reptile(int a, String n){
        super(a,n);
		this.tendsEggs = false;
        this.repoMethod = "eggs";
    }    
    Reptile(int a, String n, String f){
        super(a,n,f);
		this.tendsEggs = false;
        this.repoMethod = "eggs";
    }       
	public abstract void display();    
	public void typeInfo(){
		System.out.println("(optional) tends eggs: " + this.tendsEggs);
	}
	public void setEggs(boolean tend){
		this.tendsEggs = tend;
	}
	public boolean getEggs(){ return this.tendsEggs; }
}

