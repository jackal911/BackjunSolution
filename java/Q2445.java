import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2445 { // Q2445 별 찍기 - 8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();
        StringBuilder blank = new StringBuilder();
        StringBuilder output = new StringBuilder();
        blank.append(" ".repeat(Math.max(0, T)));
        for(int j=0;j<T;j++){
            star.append("*");
            blank.deleteCharAt(0);
            output.append(star);
            output.append(blank);
            output.append(blank);
            output.append(star);
            output.append("\n");
        }
        for(int k=0;k<T-1;k++){
            star.deleteCharAt(0);
            blank.append(" ");
            output.append(star);
            output.append(blank);
            output.append(blank);
            output.append(star);
            output.append("\n");
        }
        System.out.print(output);
    }
}
