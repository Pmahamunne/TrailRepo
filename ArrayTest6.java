package Arrays;

import java.util.Scanner;

class ArrayTest2{
    int a, sum = 0;
    void Test(){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<a.length;i++){
            a[i] = sc.nextInt();
            sum = sum +a[i];
        }
        System.out.println(sum/5);
    }

}

public class ArrayTest6 {
    public static void main(String[] args) {
        ArrayTest2 arrayTest2 = new ArrayTest2();
        arrayTest2.Test();
    }
}
