public class Main {
    public static void main(String[] args) {
        Cat catBarsic = new Cat("Barsic");
        Dog dogBobic = new Dog("Bobic");
        Dog dogKozi = new Dog("Kozi");
        Cat catSnow = new Cat("Snow");
        Cat catKuzya = new Cat("Kuzya");
        Cat catMasha = new Cat("Masha");

        dogBobic.run(51);
        dogBobic.swim(9);
        System.out.println();

        catBarsic.run(44);
        catBarsic.swim(5);
        System.out.println();

        catKuzya.run(4);
        catMasha.swim(1);
        System.out.println();

        dogKozi.run(555);
        dogKozi.swim(14);
        System.out.println();

        catSnow.run(240);
        System.out.println();

        Cat.getCount();
        Dog.getCount();


    }
}
