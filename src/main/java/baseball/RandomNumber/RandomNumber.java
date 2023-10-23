package baseball.RandomNumber;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.ArrayList;

public class RandomNumber {

    public int computerRandomNumber(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        int generatorNumber = computer.get(0)*100 + computer.get(1)*100+computer.get(2)*100;
        return generatorNumber;
    }

}
