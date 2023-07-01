package Arrays;

import java.util.Scanner;
import java.util.Arrays;

class EqualArray{
    void ArrayEqual(){
        int A1[] = new int[5];
        int A2[] = new int[5];

        Scanner sc = new Scanner(System.in);
        boolean B1 = Arrays.equals(A1,A2);
        System.out.println(B1);

    }
}

public class ArrayTest10 {
    public static void main(String[] args) {
        EqualArray equal = new EqualArray();
        equal.ArrayEqual();

    }
}
