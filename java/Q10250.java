import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i=0;i<T;i++){
            int H = s.nextInt();
            int W = s.nextInt();
            int N = s.nextInt();
            int floor = N % H;
            int room = N / H + 1;
            if(floor==0){
                floor = H;
                room = N / H;
            }
            System.out.println(100*floor+room);
        }
    }
}
