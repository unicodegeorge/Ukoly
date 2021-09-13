import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        String input = getInput();
        while(!input.matches("[0-9]+")) {
            input = getInput();
        }

        int y = input.length();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.substring(0, y));
            y--;
        }
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        String input = sc.next();
        return input;
    }

}
