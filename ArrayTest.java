package Arrays;

import java.lang.reflect.Array;

class ArrayClass {

    int element;
    String element1;

    void Array() {
        int a[] = new int[7];
        a[0] = 10;
        a[1] = 30;
        a[2] = 76;
        a[56] = 89;
        for (int element : a) {
            System.out.println(element);
        }

    }


    void Array(int a) {
        int b[] = {98, 87, 90, 87, 65};
        String s[] = {"a", "B", "C", "D"};
        for (int element : b) {


            for (String element1 : s) {
                System.out.println(element + " " + element1);
            }
        }

    }
}

    public class ArrayTest {
        public static void main(String[] args) {
            ArrayClass arrayClass = new ArrayClass();
            arrayClass.Array();


        }

}
