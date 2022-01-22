import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main { // Q2751 - 수 정렬하기 2
    static int[] sort(int[] input){
        final int LENGTH = input.length;
        int[] tempFirst;
        int[] tempSecond;
        int[] result = new int[LENGTH];
        tempFirst = Arrays.
                copyOfRange(input,0,(LENGTH)/2);
        tempSecond = Arrays.
                copyOfRange(input,(LENGTH)/2,LENGTH);
        if(tempFirst.length == 0 || tempSecond.length ==0){
            return input;
        }
        if(tempFirst.length == 1 && tempSecond.length == 1){
            result[0] = Integer.min(tempFirst[0],tempSecond[0]);
            result[1] = Integer.max(tempFirst[0],tempSecond[0]);
        }else{
            tempFirst = sort(tempFirst);
            tempSecond = sort(tempSecond);
            int i=0;
            int j=0;
            for(int k=0;k<LENGTH;k++){
                if(tempFirst[i]<tempSecond[j]){
                    result[k] = tempFirst[i];
                    if(i<tempFirst.length-1) {
                        i++;
                    }else{
                        for(int m=j;m<tempSecond.length;m++){
                            result[k+1] = tempSecond[m];
                            k++;
                        }
                    }
                }else{
                    result[k] = tempSecond[j];
                    if(j<tempSecond.length-1) {
                        j++;
                    }else{
                        for(int m=i;m<tempFirst.length;m++){
                            result[k+1] = tempFirst[m];
                            k++;
                        }
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] toSort = new int[N];
        String output = "";
        for(int i=0;i<N;i++){
            toSort[i] = Integer.parseInt(br.readLine());
        }
        toSort = sort(toSort);
        for(int j=0;j<N;j++){
            output += toSort[j];
            if(j!=N-1){
                output += "\n";
            }
        }
        System.out.println(output);
    }
}
