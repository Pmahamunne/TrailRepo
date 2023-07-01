package Arrays;

import java.util.Scanner;

class Reversenum {
    Scanner sc= new Scanner(System.in);
    void ArrayReverse() {
        int a[] = new int[5];


        for (int i = 0; i< a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i< a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nPrint array in reverse form");
        for (int i = a.length-1; i>=0; i--){
            System.out.print( a[i]  + " ");
        }




    }

    void Rev(){
        int temp= 0;
        int Arr1[] = {3,4,5,6,7,7};
        for (int element: Arr1){
            for (int j=element-1; j>Arr1.length;j--){
                System.out.print(Arr1[j]);



            }
//            System.out.print(element + " ");


        }

    }
}

public class ArrayTest4 {
    public static void main(String[] args) {
        Reversenum reversenum = new Reversenum();
        reversenum.Rev();
    }
}
