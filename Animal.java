public abstract class Animal{

    protected int age;
    protected String name;
    protected String consStatus;
    protected String repoMethod;
    protected String food;

    public Animal(int a, String n){
        this.age = a;
        this.name = n;
    }
    public Animal(int a, String n, String f){
		this(a,n);
		this.food = f;
    }
    
    public String getName() { return this.name; }    
    public void setName(String n) { this.name = n; }

    public int getAge() { return this.age; }
    public void setAge(int a) { this.age = a; }

    public String getStatus() { return this.consStatus; }
    
    public String getFood() { return this.food; }
    public void setFood(String f) { this.food = f; }

    public String getRepo() { return this.repoMethod; } 

    public abstract void display();
}
