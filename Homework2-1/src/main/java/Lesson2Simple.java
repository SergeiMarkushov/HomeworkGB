public class Lesson2Simple {
    public static void main(String[] args) {
        System.out.println(isNumbersIn10to20(4,6));
        PositiveOrNegative(-10);
        System.out.println(isTrueOrFalse(6));
        phrase(2, "Hello");
        System.out.println(isTheYearLeapYear(2020));

    }

    public static boolean isNumbersIn10to20(int a, int b){
        if(a + b >= 10 && a + b <= 20){
            return true;
        }else{
            return false;
        }
    }

    public static void PositiveOrNegative(int number){
        if (number<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Positive number");
        }
    }
    public static boolean isTrueOrFalse(int number){
        if (number>=0){
            return true;
        }else{
            return false;
        }
    }
    public static void phrase(int times, String phrase){
        for (int i = 0; i < times; i++) {
            System.out.println(phrase);
        }
    }

    public static boolean isTheYearLeapYear(int year){
        boolean fourHandred = year% 400 ==0;
        boolean another = year % 4 != 0 && year % 100 !=0;

        if (fourHandred || another){
            return false;
        }else{
            return true;
        }

    }

}

