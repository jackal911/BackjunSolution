import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2522 { // 별 찍기 - 12
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stars = new String[N];
        String star = "";
        for(int i=0;i<N;i++) {
            star += "*";
            stars[i] = star;
        }
        for(int j=0;j<N;j++) {
            System.out.printf("%" + N + "s\n", stars[j]);
        }
        for(int j=N-2;j>=0;j--){
            System.out.printf("%" + N + "s\n", stars[j]);
        }
    }
}
