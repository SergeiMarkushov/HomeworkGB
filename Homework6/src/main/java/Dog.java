public class Dog extends Animal {

    private static int count;

    public Dog(String name){
        super(name);
        count++;
    }

    public static void getCount(){
        System.out.println("We have " + count + " dogs");
    }

    @Override
    public void swim(int distance){
        if (distance <= 10){
            System.out.println("Dog " + getName() + " swim " + distance + " meters");
        }else{
            System.out.println("Dog's can't swim so far");
        }
    }

    @Override
    public void run(int distance){
        if (distance <= 500){
            System.out.println("Dog " + getName() + " run " + distance + " meters");
        }else{
            System.out.println("Dog's can't run so far");
        }
    }
}
