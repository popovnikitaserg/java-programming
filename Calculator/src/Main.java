import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = calc(input);

        System.out.println(result);
    }

    public static String calc(String input) throws Exception{
        String[] calculus = input.split(" ");
        if (calculus.length == 3) {
            if (isNumCorrect(calculus[0]) && isNumCorrect(calculus[2])) {
                if (calculus[1].equals("+")) {
                    return Integer.toString(Integer.parseInt(calculus[0]) + Integer.parseInt(calculus[2]));
                } else if (calculus[1].equals("-")) {
                    return Integer.toString(Integer.parseInt(calculus[0]) - Integer.parseInt(calculus[2]));
                } else if (calculus[1].equals("/")) {
                    return Integer.toString(Integer.parseInt(calculus[0]) / Integer.parseInt(calculus[2]));
                } else if (calculus[1].equals("*")) {
                    return Integer.toString(Integer.parseInt(calculus[0]) * Integer.parseInt(calculus[2]));
                }
            }
        }
        throw new Exception();
    }

    public static boolean isNumCorrect(String str) {
        try {
            int num = Integer.parseInt(str);
            return num > 0 && num < 11;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
