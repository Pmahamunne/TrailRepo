package Arrays;

import java.util.Scanner;

class Array{
    int temp;
    void Arraytest1(){
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();                //(For taking user input)
        }
        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]< arr[j]){                //(Comparing Between Array[i] and array[j])
                    temp= arr[i];                   //by using swapping value exchange for i and j
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i<arr.length; i++){

            System.out.print(  arr[i] + " ");
        }


    }
}

public class arrayTest7 {
    public static void main(String[] args) {
        Array arraytest  = new Array();
        arraytest.Arraytest1();
    }
}
