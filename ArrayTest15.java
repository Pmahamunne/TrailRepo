package Arrays;

class ArrayPractice{
    void Del_Ele(){

        int Pos = 2;
        int a[] = {1,2,3,4,5};
        for (int i = 0;i<=a.length-1;i++){
            if (Pos ==a[i]){
                for (int j = i;j<a.length-1;j++){
                    a[j] = a[j+1];
                }

            }
        }
        for (int i = 0;i<a.length-1;i++){
            System.out.print(a[i]+ " ");
        }


    }
}

public class ArrayTest15 {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.Del_Ele();
    }
}
