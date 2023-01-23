import javax.naming.PartialResultException;
import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//         weights[0] = 90;
//         int januaryWeights = weights[0];
//         System.out.println(januaryWeights);
//         //Или так
//         System.out.println(weights[0]);
//         System.out.println(weights[4]);
//         int january = 0;
//         System.out.println(weights[january]);
//         for (int i = 0; i < weights.length; i++) {
//             System.out.println(weights[i]);
//               }
        //Задача 1
        System.out.println("Задача №1");
        int[] num1 = new int[3];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
//       for (int i = 0; i < num1.length; i++ ){
//            if (i < num1.length-1){
//                System.out.print(num1[i] + ", ");
//            }else {
//                System.out.print(num1[i]);
//            }
//       }
//        for (int i = num1.length-1; i >= 0; i-- ) {
//                System.out.print(num1[i]);
//            if (i!=0){
//                System.out.print(", ");
//            }
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] % 2 != 0) {
                num1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(num1));
        {
            System.out.println();
        }
            double[] num2 = new double[]{1.57, 7.654, 9.986};
            for (int arr = num2.length-1; arr >=0; arr--) {
                System.out.print(num2[arr]);
                if (arr!=0){
                    System.out.print(", ");
                }


            }
            System.out.println();


            int[] num3 = {4, 5, 6};
            for (int arr1 = num3.length-1; arr1 >=0; arr1--) {
                System.out.print(num3[arr1]);
                if(arr1!=0){
                    System.out.print(", ");

                }
            }



        }

}

