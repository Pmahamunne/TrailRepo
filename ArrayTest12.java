package Arrays;
class DuplicateElemenmt{
    void ArrayDuplicate(){
        int Arr[] = {1,2,2,3,4,3,2,1,1};
        for (int i =0; i<Arr.length;i++){
            for (int j = i+1; j<Arr.length;j++){
                if (Arr[i]==Arr[j]){
                    System.out.println(Arr[j]);
                }
            }
        }
    }
}

public class ArrayTest12 {
    public static void main(String[] args) {
        DuplicateElemenmt DArray= new DuplicateElemenmt();
        DArray.ArrayDuplicate();
    }
}
