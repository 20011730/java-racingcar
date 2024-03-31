package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 자동차 모음
public class Cars {
    private final List<Car> cars;

    public Cars(List<String> carNames){
        cars = new ArrayList<>();

        createCarList(carNames);
    }

    // 차량 리스트 생성
    public void createCarList(List<String> carNames){
        for (String carName : carNames){
            Car car = new Car(carName);
            cars.add(car);
        }
    }

    // 차량 목록 반환
    public List<Car> getCars(){
        return cars;
    }

    // 차량 목록 이동
    public void moveCars(){
        for (Car car : cars){
            car.moveCar();
        }
    }
}
