package baseball.Controller;
import baseball.OutInputMessage.OutputMessage;
import baseball.Calculator.calculator;
import baseball.OutInputMessage.UserNumber;

public class Control {
    public void Controller() {
        OutputMessage outmessage = new OutputMessage();
        outmessage.StartGame();

        while (true) {
            UserNumber userNumberInput = new UserNumber();
            int userNumber = userNumberInput.Check_Number();
            calculator gameCalculator = new calculator();
            String resultMessage = gameCalculator.CountingBaseball(userNumber);
            System.out.println(resultMessage);

            if (resultMessage.contains("3스트라이크")) {
                System.out.println(resultMessage);
                outmessage.Re_Request();
                String restartChoice = userNumberInput.Restart_Game();
                if (restartChoice.equals("1")) {
                    continue;  // 게임 재시작
                } else if (restartChoice.equals("2")) {
                    System.out.println("게임종료");
                    break;  // 게임 종료
                }
            }
        }
    }

}
