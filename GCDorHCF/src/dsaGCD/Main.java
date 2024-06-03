package dsaGCD;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(UclidGCD(a,b));
    }

    private static int UclidGCD(int a, int b) {
        while(a!=0 && b!=0){
            if (a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a != 0){
            return a;
        }
        else{
            return b;
        }
    }
}
