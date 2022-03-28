public abstract class Animal{

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void swim(int distance);

    public abstract void run(int distance) ;
}



