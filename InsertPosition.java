package Arrays;

import java.util.Scanner;

class InsertPosition1 {
    int pos = 3, num, x = 100, n;

    void IPosition() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n + 1];

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter position:");
        pos = sc.nextInt();
        System.out.print("Enter Element:");
        x = sc.nextInt();
        for (int i = (n - 1); i >= (pos - 1); i--) {

            a[i + 1] = a[i];
        }
        a[pos - 1] = x;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n]);


    }

    void InsertP() {
        int a[] = {1, 2, 3, 4, 5};
        for (int i = a.length - 1; i > pos - 1; i--) {
            a[i] = a[i - 1];

        }
        a[pos - 1] = x;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    void InserPo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter Element number:");
        num = sc.nextInt();
        int a[] = new int[num + 1];


        System.out.println("Eneter numbers in array:");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter position");
        pos = sc.nextInt();
        System.out.println("Enter number you want to add:");
        n = sc.nextInt();


        for (int i = num - 1; i >= pos - 1; i--) {
            a[i + 1] = a[i];
        }
        a[pos - 1] = n;
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[num] + " ");


    }

    void Del_Ele() {
        int del_ele = 3;

        int a[] = {1, 2, 3, 4, 3};
        for (int i = 0; i <= a.length - 1; i++) {
            if (del_ele == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }


    void ToggleCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String S = sc.nextLine();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
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

}

public class InsertPosition {
    public static void main(String[] args) {
        InsertPosition1 insertPosition1 = new InsertPosition1();
        insertPosition1.Del_Ele();
    }
}
