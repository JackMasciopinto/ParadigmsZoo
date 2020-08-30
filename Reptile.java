public abstract class Reptile extends Animal{ 
	Reptile(int a, String n){
        super(a,n);
        this.repoMethod = "eggs";
    }    
    Reptile(int a, String n, String f){
        super(a,n,f);
        this.repoMethod = "eggs";
    }       
	public abstract void display();    
}

