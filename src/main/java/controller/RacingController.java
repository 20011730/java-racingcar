package controller;

import domain.Cars;
import domain.TryCount;
import view.InputView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void run() throws IOException {
        // 차량 이름 입력
        Cars cars = new Cars(InputView.setCarName());

        // 시도 횟수 입력
        TryCount tryCount = new TryCount(InputView.setTryCount());

    }

}
