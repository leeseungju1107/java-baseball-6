package baseball.OutInputMessage;
import camp.nextstep.edu.missionutils.Console;
import java.util.Set;
import java.util.HashSet;

public class UserNumber {
    public String String_Number() {
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine().trim(); // 입력값 앞뒤 공백 제거
        return userInput;
    }

    public int Check_Number() {
        String userInput = String_Number(); // 입력값 앞뒤 공백 제거

        if (userInput.isEmpty()) {
            throw new IllegalArgumentException("입력값이 없습니다.");
        }

        char[] finalCheckNumbers = userInput.toCharArray();

        if (finalCheckNumbers.length != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해야 합니다.");
        }

        // 중복 숫자 검사를 위한 Set
        Set<Character> seenNumbers = new HashSet<>();

        for (char finalCheckNumber : finalCheckNumbers) {
            int num = Character.getNumericValue(finalCheckNumber);

            if (num < 1 || num > 9) {
                throw new IllegalArgumentException("1에서 9 사이의 숫자만 입력해야 합니다.");
            }

            // 중복된 숫자 검사
            if (!seenNumbers.add(finalCheckNumber)) {
                throw new IllegalArgumentException("중복된 숫자가 있습니다.");
            }
        }

        int realNumber = Integer.parseInt(userInput);
        return realNumber;
    }
    public String Restart_Game() {
        while (true) {
            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: ");
            String restartChoice = Console.readLine().trim();

            if (restartChoice.equals("1")) {
                return "1"; // 게임 재시작 (문자열로 반환)
            } else if (restartChoice.equals("2")) {
                return "2"; // 게임 종료 (문자열로 반환)
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }
}
