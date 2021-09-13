import java.util.Scanner;

public class Cara {
    public static void main(String[] args) {
        String amount = getInput();
        System.out.println(amount);
        while(!amount.matches("[0-9]+")) {
            amount = getInput();
        }
        for(int i = 0; i < Integer.parseInt(amount); i++) {
            System.out.print("*");
        }
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak velkou caru chcete vykreslit?");
        return sc.nextLine();
    }


}
