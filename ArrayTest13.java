package Arrays;
class ArrayAvg{
    int avg;
    float sum = 0;
    void ArrayAvg(){
        int Arr[] = {10,20,30,40,30};
        for (int element : Arr){
            sum = sum+element;



        }
        if (sum<=25){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
        System.out.println(sum/5);


    }
}

public class ArrayTest13 {
    public static void main(String[] args) {
        ArrayAvg arrayAvg = new ArrayAvg();
        arrayAvg.ArrayAvg();
    }
}
