package Arrays;

import java.util.Scanner;

class FindArray{
    int n,count;
    void FindArray(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println( "\n" +  "Enter number");
        n = sc.nextInt();
        for (int i = 0; i<arr.length; i++){
                if (arr[i] ==n){
                    count++;
                }
        }
        if (count>0)
            System.out.println("item found");
        else
            System.out.println("Item not found");

    }
}

public class ArrayFind {
    public static void main(String[] args) {
        FindArray findArray = new FindArray();
        findArray.FindArray();
    }
}
