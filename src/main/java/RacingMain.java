import controller.RacingController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기

        RacingController rcController = new RacingController();

        rcController.run();

    }
}
