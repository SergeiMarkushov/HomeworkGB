public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public void info(){
        if(getFood() !=0) {
            System.out.println("Food in the plate: " + getFood());
        }else{
            System.out.println("Place food in the plate or don't eat");
        }
    }

    public void decreaseFood(int appetite){
        if (getFood() !=0 && appetite <= this.food) {
            this.food -= appetite;
        }else{
            System.out.println("No food in the plate or appetite of the cat is more then food in the plate");
        }
    }
    public void increaseFood(int puttFood){
        this.food+=puttFood;
    }

    public int getFood() {
        return food;
    }
}
