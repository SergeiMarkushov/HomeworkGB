public class Homework2Simple {
    public static void main(String[] args) {
        System.out.println(isNumbersIn10to20(4,5));
        PositiveOrNegative(4);
        System.out.println(isTrueOrFalse(-5));
        phrase(2, "Hello");
        System.out.println(isTheYearLeapYear(2020));

    }

    public static boolean isNumbersIn10to20(int a, int b){
        if(a +b  >= 10 && a + b <= 20){
            return true;
        }else{
            return false;
        }
    }

    public static void PositiveOrNegative(int a){
        if (a<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Positive number");
        }
    }
    public static boolean isTrueOrFalse(int a){
        if (a >= 0){
            return true;
        }else{
            return false;
        }
    }
    public static void phrase(int a, String b){
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static boolean isTheYearLeapYear(int year){
        boolean fourHangred = year% 400 ==0;
        boolean another = year % 4 != 0 && year % 100 !=0;

        if (fourHangred || another){
            return false;
        }else{
            return true;
        }

    }

}


