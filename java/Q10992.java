import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10992 { // 별 찍기 - 17
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stars = new String[N];
        String star = "*";
        stars[0] = star;
        stars[N-1] = "*".repeat(2*N-1);
        if(N>=3){
            stars[1] = "* *";
        }
        for(int i=2;i<N-1;i++) {
            stars[i] = stars[i-1].replaceFirst(" ","   ");
        }
        int frame = N;
        for(int j=0;j<N;j++) {
            System.out.printf("%" + frame + "s\n", stars[j]);
            frame++;
        }
    }
}
