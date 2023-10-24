package baseball.Calculator;
import baseball.OutInputMessage.OutputMessage;
import baseball.RandomNumber.RandomNumber;
import baseball.OutInputMessage.UserNumber;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class calculator {
    public int[] Arraycomputer() {
        RandomNumber computer = new RandomNumber();
        int randomNumber = computer.computerRandomNumber();
        int[] arraycomputer = Stream.of(String.valueOf(randomNumber).split("")).mapToInt(Integer::parseInt).toArray();
        return arraycomputer;
    }
    public int[] Arrayuser(){
        UserNumber user = new UserNumber();
        int userNumber = user.Check_Number();
        int[] arrayuser = Stream.of(String.valueOf(userNumber).split("")).mapToInt(Integer::parseInt).toArray();
        return arrayuser;
    }
        public String CountingBaseball() {
            List<Integer> computerDigits = new ArrayList<>();
            List<Integer> userDigits = new ArrayList<>();
            int strike = 0;
            int ball = 0;
            int[] counting_user = Arrayuser();
            int[] counting_computer = Arraycomputer();
            for (int i = 0; i < 3; i++) {
                if (counting_user[i] == counting_computer[i]) {
                    strike++;
                }
            }
            for (int i = 0; i < 3; i++) {
                computerDigits.add(counting_computer[i]);
                userDigits.add(counting_user[i]);
            }
            for (int i = 0; i < 3; i++) {
                if (userDigits.get(i).equals(computerDigits.get(i))) {
                    continue;
                }
                if (userDigits.contains(computerDigits.get(i))) {
                    ball++;
                }
            }
            String resultMessage = createResultMessage(strike, ball);
            return resultMessage;
        }
        private String createResultMessage(int strike, int ball) {
            if (strike == 0 && ball == 0) {
                return "낫싱";
            }
            StringBuilder result = new StringBuilder();
            if (strike > 0) {
                result.append(strike).append("스트라이크 ");
            }
            if (ball > 0) {
                result.append(ball).append("볼");
            }
            if(strike == 3){
                return "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
            }
            return result.toString();
        }
    }

