public class HomeWorkApp {
    public static void printTheeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a = 10;
        int b = 5;
        int sum = a + b;
        if (sum > 0) {
            System.out.println("summa poloshitelnaya");
        } else {
            System.out.println("summa otricatelnaya");
        }
    }
    public static void printColor () {
        int value = -6;
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value <= 100) {
            System.out.println("green");
        }
    }
    public static void compareNumbers () {
        int a = 70;
        int b = -120;
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }
    }
 //next
    public static void main (String[]args){
        printTheeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
