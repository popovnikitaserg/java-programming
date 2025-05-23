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
            if (isNum(calculus[0]) && isNum(calculus[2])) {
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

    public static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
