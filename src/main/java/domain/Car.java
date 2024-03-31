package domain;

// 자동차
public class Car {
    private static final int RANDOM_MINIMUM = 4;
    private final CarName name;
    private final CarPosition position;

    // 차량 초기 설정
    public Car(String name){
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    // 차량 이름 반환
    public String getCarName(){
        return name.getCarName();
    }

    // 차량 위치 반환
    public int getCarPosition(){
        return position.getCarPosition();
    }

    // 차량 한칸 이동 (전진)
    public void moveCar(){
        int random_number = (int)(Math.random() * 9);

        if (random_number >= RANDOM_MINIMUM){
            position.movePosition();
        }

    }
}
