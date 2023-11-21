package MyApp;

import jdk.dynalink.beans.StaticClass;

public class Main {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum1 = 0;
        int sum2 = 0;
        int line = 0;


        for (int num : numbers) {
            line ++;
            sum2 += num;
            System.out.println(line + ") " + "Num is " + num + "," + " sum is " + sum2);
            sum1 += num;
        }

        System.out.println("________________________" + "\nSum of numbers is " + sum1);

    }
}
