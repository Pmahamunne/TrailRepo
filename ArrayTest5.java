package Arrays;

import java.util.Scanner;

class ArrayAdding{
    int sum = 0;

     void ArrayAdd(){
         int arr[] = new int[5];
         Scanner sc  = new Scanner(System.in);
         for (int i = 0; i<arr.length;i++){
             arr[i] = sc.nextInt();
         }
         System.out.println("Input array num is:");
         for (int i = 0; i<arr.length;i++){
             System.out.print(arr[i] + " ");
             sum = arr[i]+sum;
         }
         System.out.println(  "\n" + "Output is:" +   sum);
     }
}

public class ArrayTest5 {
    public static void main(String[] args) {
        ArrayAdding arr = new ArrayAdding();
        arr.ArrayAdd();
    }
}
