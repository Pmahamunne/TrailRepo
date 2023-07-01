//package Arrays;
//
//class ArrayRev{
//    void RevNum(){
//        int arr[]= {12,23,34,54,11};
//        int Total= arr.length;
//        int temp;
//        int a = Math.floorDiv(Total,2);
//        for(int i = 0;i<a;i++){
//            temp = arr[i];
//            arr[i] = arr[Total-i-1];
//            arr[Total-i-1] = temp;
//        }
//        for (int element : arr){
//            System.out.println(element);
//        }
//
////        char Ch[] = {'A' , 'B' , 'C' , 'D' , 'E'};
////        Total = Ch.length;
////        char 'A';
////
////        char A = (char) Math.floorDiv(Total,2);
////        for (int i = 0 ; i<A;i++){
////            temp = Ch[i];
////            Ch[i] = Ch[Total-i-1];
////            Ch[Total-i-1] = temp;
////
////        }
////    }
//    void AccendingNum() {
//        int num[] = {6, 5, 3, 6, 5};
//        int max = 0;
//
//        for(int element: num){
//            if(element>max){
//                max=element;
//            }
//        }
//        System.out.println(max);
//    }
//}
//
//public class ArrayReverse {
//    public static void main(String[] args) {
//        ArrayRev arrayRev = new ArrayRev();
//        arrayRev.AccendingNum();
//    }
//}
