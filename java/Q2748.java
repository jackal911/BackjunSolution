import java.util.Scanner;

public class Q2748 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] pbo = new long[91];
        pbo[0] = 0;
        pbo[1] = 1;
        int i=2;
        while(i<=n){
            pbo[i] = pbo[i-1] + pbo[i-2];
            i++;
        }
        System.out.println(pbo[n]);
    }
}