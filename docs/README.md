# baseball game

## 기능요구 사항

### 게임 실행

1. 게임을 실행한다는 기능
    1. 숫자 야구 게임을 시작합니다.
        1. `public void StartGame(){    System.*out*.println("숫자 야구 게임을 시작합니다.");}`
2. 3자리의 중복되지 않는 난수를 생성하는 기능
    1. `public int computerRandomNumber(){`
3. 사용자에게 중복되지 않는 숫자를 입출력받는 기능
    1. `public void RequestInputNumber(){    System.*out*.println("숫자를 입력해주세요 : ");}`
    2. (1~9이외에 다른 입력 → IllegalArgumentException)
        1. `public int Check_Number() {`
4. 난수와 입력받은 수를 비교해 카운팅을 하는 기능 
    1. 컴퓨터의 수가 425일 때
        1. 123일 경우 1스트라이크
        2. 456일 경우 1볼 1스트라이크
        3. 780일 경우 낫싱
5. 난수와 입력받은 수가 동일시 게임 종료를 하는 기능
    1. `public void FinishGame(){`
6. 게임이 종료한 후 재 시작과 종료중 선택하는 기능
    1. 재시작은 1, 종료는 2
        1. `public void Re_Request(){`
    2. 잘못된 입력시IllegalArgumentException 발생후 애플리케이션 종료
