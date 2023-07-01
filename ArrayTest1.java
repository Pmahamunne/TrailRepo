package Arrays;

import javax.lang.model.element.Name;

class Test2 {
    int numbers;
    int Array() {
        String Names[] = new String[4];
        int Num[] = {1,2,3,4};
        Names[0] = "Prathamesh";
        Names[1] = "Sidhart";
        Names[2] = "Mayur";
        Names[3] = "Omkar";


        for (int N1 : Num) {
            for (String S : Names) {

            }
        }
        return 0;
    }
    int Array(int a) {
        int Num[] = {1,2,3,4};

        for (int N1 : Num) {
        }
        return 0;
    }

    String Array(String s){
        String name[] = new String[2];
        name[0] = "Apache";
        name[1] = "Raider";
        for (String N : name){

        }
        return "java";
    }
}

public class ArrayTest1 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.Array();


    }
}
