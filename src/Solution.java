import java.util.Arrays;
import java.util.stream.LongStream;

class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        return LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w==l) || l==0).count(),
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w==l)).count()
        )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }

    public static void main(String[] args) {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(solution(lottos,win_nums)));
    }
}