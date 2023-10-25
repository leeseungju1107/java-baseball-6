package baseball.OutInputMessage;
import camp.nextstep.edu.missionutils.Console;

public class UserNumber {
    public String String_Number(){
        String User_Input_Number = Console.readLine();
        return User_Input_Number;
    }
    public String Restart_Number(){
        String restart_number = Console.readLine();
        return restart_number;
    }
    public int Check_Number() {
        String checkNumber = String_Number();
        if (checkNumber.length() != 3) {
            throw new IllegalArgumentException("애플리케이션 종료");
        }
        char[] final_Check_Numbers = String_Number().toCharArray();
        for (char final_Check_Number : final_Check_Numbers) {
            int num = Character.getNumericValue(final_Check_Number);
            if (num < 1 || num > 9) {
                throw new IllegalArgumentException("애플리케이션 종료");
            }
        }
        int RealNumber = Integer.parseInt(checkNumber);
        return RealNumber;
    }
}