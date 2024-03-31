package domain;

public class CarPosition {
    private static final int START_POSITION = 0;
    private int myPosition;

    public CarPosition(){
        // 자동차 초기 위치 설정
        myPosition = START_POSITION;
    }

    // 차량 위치 반환
    public int getCarPosition(){
        return myPosition;
    }

    // 차량 전진
    public void movePosition(){
        myPosition++;
    }
}
