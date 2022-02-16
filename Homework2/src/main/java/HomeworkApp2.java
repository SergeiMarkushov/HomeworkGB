import java.util.Scanner;

public class HomeworkApp2 {

    public static void main(String[] args) {
        isNumbersIn10to20();
        System.out.println("Next one!");
        System.out.println();
        PositiveOrNegative();
        System.out.println("Next one!");
        System.out.println();
        isTrueOrFalse();
        System.out.println("Next one!");
        System.out.println();
        phrase();
        System.out.println("Next one!");
        System.out.println();
        isTheYearLeapYear();

    }

    public static boolean isNumbersIn10to20(){
        System.out.println("return true or false");
        System.out.println("10 <= number >= 20");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int summ = numberOne + numberTwo;
        if(summ >= 10 && summ <= 20){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    public static void PositiveOrNegative(){
        System.out.println("Negative or positive number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int a = sc.nextInt();
        if (a<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Positive number");
        }
    }
    public static boolean isTrueOrFalse(){
        System.out.println("return positive or negative number");
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>=0){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
    public static void phrase(){
        System.out.println("N times print phrase");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phrase");
        String phrase = sc.nextLine();
        System.out.println("Enter how many times must print");
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(phrase);
        }
    }

    public static boolean isTheYearLeapYear(){
        System.out.println("Leapyear or not?");
        System.out.println("Enter the year... for example 2021");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean fourHangred = year% 400 ==0;
        boolean another = year % 4 != 0 && year % 100 !=0;

        if (fourHangred || another){
            System.out.println("Not leap yaer");
            return false;
        }else{
            System.out.println("Leap year");
            return true;
        }

    }

}
