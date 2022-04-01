public class Cat {
    private String name;
    private int appetite;
    private int fullAppetite; //устанавливаем коту "полный желудок"
    private int hungry; // устанавливаем коту, что изначально он голоден.

    public Cat(String name, int appetite, int fullAppetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullAppetite = fullAppetite;
        this.hungry = 0;
    }

    public void eat(Plate p) {
        if(this.hungry != fullAppetite) {
            p.decreaseFood(appetite);
            this.hungry += appetite;
        }else{
            System.out.println("I'm full");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getHungry() {
        return hungry;
    }


    public boolean getFullAppetite(int hungry) {
        if (this.fullAppetite == hungry){
            return true;
        }
        return false;
    }

    public void catInfo(){
        System.out.println("Cat " + getName() + " hungry " + getHungry());
        System.out.println("Cat " + getName() + " is full? " + getFullAppetite(getHungry()));
    }

}
