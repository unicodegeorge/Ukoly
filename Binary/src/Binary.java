import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        String input = getInput();
        while(!input.matches("[0-9]+")){
           input = getInput();
        }
        System.out.println(getBinary(input));
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        return new String(sc.next());
    }

    public static String getBinary(String input) {
        String finalResult = "";
        int lastResult = Integer.parseInt(input);

        while(lastResult != 0) {
            int result = lastResult % 2;
            finalResult += result;
            lastResult = lastResult / 2;
        }
        StringBuffer stringBuffer = new StringBuffer(finalResult);
        String reversedResult = stringBuffer.reverse().toString();
        return reversedResult;
    }
}
