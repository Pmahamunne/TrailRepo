package Arrays;

import java.util.Scanner;

class AccendingArray{
    void Accenuding() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {                   //for comparing between two numbers of array
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Array by Accending order");
        for (int i = 0; i<5; i++){
            System.out.print(arr[i] + " ");
        }

    }


}

class DecendingArray {
    void ArrayDecend() {
        int temp;
        int max =0;
        int Arr[] = {23, 43, 1, 2, 23, 43};
        for(int i = 0; i<Arr.length;i++){
            for (int j = i+1;j<Arr.length;j++){
                if(Arr[i] <Arr[j]){
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] =temp;
                }
            }
        }
        for(int element: Arr){
            if (element>max){
                max =element;

            }

            System.out.print(max + " ");
        }

    }

    void RevArray(){
        int element[]  = {12,11,23,43,54};
        for (int i = 0; i<element.length;i++){
            System.out.println(element[i] +  " ");
        }
    }
}

public class ArrayTest8 {
    public static void main(String[] args) {
        AccendingArray arr = new AccendingArray();
        DecendingArray Arr = new DecendingArray();
        Arr.RevArray();
    }
}
