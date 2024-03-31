package controller;

import domain.Cars;
import view.InputView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void run() throws IOException {
        Cars cars = new Cars(InputView.setCarName());


    }

}
