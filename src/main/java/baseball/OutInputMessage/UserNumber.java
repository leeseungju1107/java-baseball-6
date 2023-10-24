package baseball.OutInputMessage;
import camp.nextstep.edu.missionutils.Console;

public class UserNumber {
    public String String_Number(){
        String User_Input_Number = Console.readLine();
        return User_Input_Number;
    }
    public int Change_Number(){
        String UserInput = String_Number();
        int Integer_Number;
        Integer_Number = Integer.parseInt(UserInput);
        return Integer_Number;
    }
    public void Check_Number(){
        int Final_Number = Change_Number();
        if(Final_Number < 100 || Final_Number > 1000){
            throw new IllegalArgumentException();
        }
    }

}

