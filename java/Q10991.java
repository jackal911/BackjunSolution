import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10991 { // 별 찍기 - 16
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stars = new String[N];
        String star = "*";
        stars[0] = star;
        for(int i=1;i<N;i++) {
            star += " *";
            stars[i] = star;
        }
        int frame = N;
        for(int j=0;j<N;j++) {
            System.out.printf("%" + frame + "s\n", stars[j]);
            frame++;
        }
    }
}
