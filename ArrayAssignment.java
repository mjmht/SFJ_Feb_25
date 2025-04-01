package Array;

import java.util.Arrays;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] num = {65, 45, 78, 90, 50, 85, 30, 55, 70, 40};

        // Printing array
        int all = num[0];
        for (int j : num){
            System.out.print(" " +j);
        }


        // Sum of all the number
        // Average of all the number
        int sum = 0; // sum
        double avg = 0; // avg

        for (int i : num) { // sum
            sum += i; //sum
            avg = (double)sum/ num.length; // avg

        }
        System.out.println("  Total Marks : " +sum); //sum
        System.out.println("Average Marks : " +avg); //avg

        // Find Max number from array
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Highest Marks : " +max);

        // Finding min number from array

        int min = num [0];

        for (int i = num.length-1 ; i > 0 ; i--) {
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Lowest Marks :" +min);

        // Finding the number of passing and failing students
        int pass = 0;
        int fail = 0;
        for (int numb: num){
            if(numb >= 50){
                pass++;
            }else {
                fail++;
            }
        }
        System.out.println("Total passing Student :" +pass);
        System.out.println("Total Failed Student :" +fail);

        // Printing in ascending order
        int arr = 0;
        Arrays.sort(num);
        System.out.println("Marks in ascending order" + Arrays.toString(num));
    }
}