package Arrays;

import java.util.Scanner;

class trail{
    int num,pos,n,x;
    char ch;
    Scanner sc = new Scanner(System.in);
    void InsertPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of array:");
        n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.print("Enter elements");
        for (int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter position of element:");
        pos= sc.nextInt();
        System.out.println("Eneter Element:");
        x= sc.nextInt();

        for (int i = n-1; i>=pos-1;i--){
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        for (int i = 0; i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println(a[n] +" ");
    }



    void ToggleCase(){
        System.out.println("Enter nay String");
        String New = sc.nextLine();

        for(int i = 0; i <New.length();i++) {
            ch = New.charAt(i);

            n = ch;
            if (n >= 'A' && n <= 'Z') {
                System.out.print((char) (n + 32));
            } else if (n >= 'a' && n <= 'z') {
                System.out.print((char) (n - 32));
            } else {
                System.out.print((char) (n));
            }
        }

    }

    void power(){

        int power,num,result=1;
        System.out.println("Enter number:");
        num = sc.nextInt();
        System.out.println("Enter Power:");
        power = sc.nextInt();
        for(int i = 1;i<=power;i++){
            result = num*result;

        }
        System.out.printf("power of %d is %d",num,result);
    }


    void Word_Count(){
        String s;
        s = sc.nextLine();
        char ch,ch1;
        int count = 1;

        for (int i = 0;i<s.length()-1;i++){
            ch = s.charAt(i);
            ch1 = s.charAt(i+1);

            if (ch == ' ' && ch1 != ' ')
                count++;

        }
        System.out.println(count);
    }

}

public class test {
    public static void main(String[] args) {
        trail tr = new trail();
        tr.Word_Count();

    }
}
