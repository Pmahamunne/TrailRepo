package Arrays;

import java.util.Scanner;
import java.util.Arrays;

class SortingArray{
    void SortArray(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}

public class ArrayTest9 {
    public static void main(String[] args) {
        SortingArray sort = new SortingArray();
        sort.SortArray();
    }
}
