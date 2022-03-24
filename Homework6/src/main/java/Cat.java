public class Cat extends Animal {

    private static int count;

    public Cat(String name){
        super(name);
        count++;
    }

    public static void getCount(){
        System.out.println("We have " + count + " cats");
    }

    @Override
    public void swim(int distance){
        System.out.println("Cat's can't swim");
    }

    @Override
    public void run(int distance){
        if (distance <= 200) {
            System.out.println("Cat " + getName() + " run " + distance + " meters");
        } else {
            System.out.println("Cat's can't run so far");
        }
    }
}
