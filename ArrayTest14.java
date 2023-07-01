package Arrays;

import java.util.Scanner;

class Array1{
    float sum = 0;
    void FloatAddition(){
        float Float[] = {34.0f,23.6f,56.7f,12.34f,34.45f};
        for (float element:Float){
            sum = sum +element;
        }
        System.out.println(sum);
    }

    void FindInt(){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int Arr[] = {12,12,45,67,89,45};
        boolean IsInArray = false;
        for (int num : Arr){
            if (num==a) {
                IsInArray = true;


            }

        }
        if (IsInArray){
            System.out.println("Num is present in array");
        }
        else {
            System.out.println("Num is not present in array");
        }
    }

    void RevArray(){
        int temp=0;
        int arr[] = {1,2,3,4,5,6};
        for (int Num: arr){

        }

    }
}

public class ArrayTest14 {
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.FindInt();
    }
}
