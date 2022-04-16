public class Test {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        sb.append("*");
//        System.out.println(sb);

        String input = "***********";
        System.out.println(input);
        input = input.replaceFirst("\\*","");
        System.out.println(input);
    }
}
