import java.util.Scanner;

public class BankovniUcet {
    public static void main(String[] args) {
        BankovniUcet bankovniUcet = new BankovniUcet();
        Scanner sc = new Scanner(System.in);
        String enteredNumber;

        System.out.println("Write the bank account number here : ");
        enteredNumber = sc.next();
        String numberWithoutBankCode = removeBankCode(enteredNumber);


        if(enteredNumber.indexOf('-') == -1){
            if(bankovniUcet.isValid(numberWithoutBankCode)){
                System.out.println(enteredNumber + " is a valid bank account");
            } else {
                System.out.println(enteredNumber + " is not a valid bank account");
            }
        } else {
            boolean prefixValid;
            boolean numberValid;

            String prefix = enteredNumber.substring(0, enteredNumber.indexOf('-'));
            String mainNumber = numberWithoutBankCode.substring(numberWithoutBankCode.indexOf('-')+1, numberWithoutBankCode.length() );

            prefixValid = bankovniUcet.isValid(prefix);
            numberValid = bankovniUcet.isValid(mainNumber);

            if(prefixValid && numberValid) {
                System.out.println(enteredNumber + " is a valid bank account");
            } else {
                System.out.println(enteredNumber + " is not a valid bank account");
            }
        }
    }

    public boolean isValid(String accNum) {
        int[] multipliers = {6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
        int sum = 0;

        for (int i = 0; i < accNum.length(); i++) {
            int correctIndex = 10 - accNum.length() + i;
            int currentNum = Character.getNumericValue(accNum.charAt(i));
            int multipliedNum = currentNum * multipliers[correctIndex];
            sum = sum + multipliedNum;
        }

        return sum % 11 == 0;
    }

    public static String removeBankCode(String accNumber) {
        if (accNumber.indexOf('/') == -1) {
            return accNumber;
        } else {
            String accNumNoCode = accNumber.substring(0, accNumber.indexOf('/'));
            return accNumNoCode;
        }
    }
}
