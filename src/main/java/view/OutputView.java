package view;

import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    // 결과 출력
    public static void printRacing(List<Car> cars){
        for (Car car : cars){
            System.out.print(car.getCarName() + " : ");
            for (int i = 0; i < car.getCarPosition(); i++)
                System.out.print("-");
            System.out.println();
        }
        System.out.println();
    }

    // 우승자 출력
    public static void printWinner(List<Car> cars){
        int max = 0;
        List<String> winners = new ArrayList<>();

        for (Car car : cars){
            if (car.getCarPosition() > max)
                max = car.getCarPosition();
        }

        for (Car car : cars){
            if (car.getCarPosition() == max)
                winners.add(car.getCarName());
        }

        String winnerResult = String.join(", ", winners);

        System.out.println(winnerResult + "가 최종 우승했습니다.");
    }
}
