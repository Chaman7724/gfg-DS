package Mathematics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int x=scn.nextInt();
        
        System.out.println(palin(x));
    }

    public static boolean palin(int x){
        int temp=x;
        int rem,sum=0;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum==temp) return true;
        else return false;

        //or we can use return (sum==temp) 

    }
}
