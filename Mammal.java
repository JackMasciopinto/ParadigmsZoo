public abstract class Mammal extends Animal{
    protected String trick;
    Mammal(int a, String n){
        super(a,n);
        this.repoMethod = "babies";
    }    
    Mammal(int a, String n, String f){
        super(a,n,f);
        this.repoMethod = "babies";
    }    
    public String getTrick() { return this.trick; }
    public void setTrick(String t) { this.trick = t; }
	public abstract void display();    
}   
