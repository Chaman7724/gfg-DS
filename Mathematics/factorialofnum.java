package Mathematics;

import java.util.Scanner;

public class factorialofnum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        System.out.println(fact(num));
    }
    public static int fact(int x){
        int res=1;
        int rem=0;
        for(int i=1;i<=x;i++){
            res=res*i;
        }
        return res;

    }
}
