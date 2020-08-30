public abstract class Bird extends Animal{
    Bird(int a, String n){
        super(a,n);
        this.repoMethod = "eggs";
    }
    Bird(int a, String n, String f){
        super(a,n,f);
        this.repoMethod = "eggs";
    }
    public abstract void display();
    /*public void typeInfo(){
            System.out.println("Food type:" + this.foodtype);
    }*/
}
