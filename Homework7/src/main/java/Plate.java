public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public void info(){
        if(getFood() !=0) {
            System.out.println("Food in plate: " + getFood());
        }else{
            System.out.println("Place food in plate or don't eat");
        }
    }

    public void decreaseFood(int appetite){
        if (getFood() !=0) {
            this.food -= appetite;
        }else{
            System.out.println("No food in the plate");
        }
    }
    public void increaseFood(int puttFood){
        this.food+=puttFood;
    }

    public int getFood() {
        return food;
    }
}
