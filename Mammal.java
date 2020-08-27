public abstract class Mammal {
    protected String trick;
    Mammal(int a, String n){
        super(a,n);
        this.repoMethod = "babies";
    }    
    Mammal(int a, String n, String f){
        super(a,n,f);
        this.repoMethod = "babies";
    }    
    public abstract String getTrick();
    public abstract void setTrick(String t) { this.trick = t; }
    
    
