package view;

import domain.Car;

import java.util.List;

public class OutputView {

    public static void printRacing(List<Car> cars){
        for (Car car : cars){
            System.out.print(car.getCarName() + " : ");
            for (int i = 0; i < car.getCarPosition(); i++)
                System.out.print("-");
            System.out.println();
        }
        System.out.println();
    }
}
