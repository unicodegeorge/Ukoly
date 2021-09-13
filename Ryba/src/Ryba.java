import java.sql.SQLOutput;
import java.util.Scanner;

public class Ryba {


    public static void main(String[] args) {

        String ryba = "<° )))-<";
        String numberOfFishhers = "asd";

        while(!numberOfFishhers.matches("[0-9]+")){
            numberOfFishhers = getNumberOfFishhersForCarlson();
        }
        for(int i =0; i < Integer.parseInt(numberOfFishhers); i++) {
            System.out.println(ryba);
        }
    }

    public static String getNumberOfFishhersForCarlson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANNY FISHHERS YOU WNT TO PRINT OUT ?");
        System.out.println("YOU GOD DAMN CARNIVORE. I HOPE YOU DIE IN PAIN. AND THAT SOMEONE WILL EAT YOU");
        System.out.println("LIKE YOU EAT OTHER ANIMALS YOU MONSTER!!");
        return sc.nextLine();
    }
}
