import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkApp3 {


    public static void invertArray(){
        System.out.println("invert array");
        int [] array = {1,0,1,1,0,0,0,1,1,0};
        System.out.println("example  " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
            array[i] = 1;
            }else if (array[i]==1) {
                array[i] = 0;
            }
        }
        System.out.println("Decision " + Arrays.toString(array));
        System.out.println();
        System.out.println(" ");
    }

    public static void fillArray(){
        System.out.println("fill array");
        int [] array = new int [100];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
            System.out.print(array[i]+",");
        }
        System.out.println();
        System.out.println(" ");
    }

    public static void changeArray(){
        System.out.println("change array");
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("We have an array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
        System.out.println("Decision          " + Arrays.toString(array));
        System.out.println();
        System.out.println(" ");
    }

    public static void fillDiagonal(){
        System.out.println("fill diagonal");
//         int [][] array = new int[6][6];
//        for (int i = 0; i < array.length;i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                if (i==j){
//                    array[i][j]=1;
//                }else{
//                    array[i][j] = 0;
//                }
//                System.out.print(array[i][j]+" ");
        //одна диаганаль

        int [][] array = new int[6][6];
        for (int i = 0; i < array.length;i++) {
            for (int j = 0, a = array.length - 1; j < array[i].length ; j++, a--) {
                if (i==j || a==i){
                    array[i][j]=1;
                }else{
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println(" ");
    }

    public static int[] methodArray() {
        System.out.println("array method");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int len = sc.nextInt();
        System.out.println("Enter initial value");
        int initialValue = sc.nextInt();
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i]=initialValue;
        }
        return array;

    }

    public static void minMax(){
        System.out.println("Task with one star - find min and max");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Enter length");
        int arrLength = sc.nextInt(); 
        int [] array = new int[arrLength];
        for (int i = 0; i < array.length; i++) {
            array [i] = rn.nextInt(20);
            //array [i] = (int)(Math.random()*10); -еще вариант с рандомом.
            System.out.print(array[i]+ ", ");
        }
            int min = array[0];
            int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
        }
            if (array[i] > max){
                max = array[i];

//        for (int numbers : array ) {
//            if (numbers < min) {
//                min = numbers;
//            }
//            if (numbers > max) {
//                max = numbers;
                // Вариант с foreach.
            }
        }
            System.out.println();
            System.out.println("minimum is " + min);
            System.out.println("maximum is " + max);
        System.out.println();
        System.out.println(" ");
    }

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(methodArray()));
        System.out.println();
        System.out.println(" ");
        minMax();
        System.out.println("Thank you!");
    }
}