package baseball.OutInputMessage;

import camp.nextstep.edu.missionutils.Console;


public class OutputMessage {
    public void StartGame(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void RequestInputNumber(){
        System.out.println("숫자를 입력해주세요 : ");
    }
    public void FinishGame(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }
    public void Re_Request(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }






}
