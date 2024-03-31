package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final BufferedReader br
            = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> setCarName() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        String str = br.readLine();

        return Arrays.asList(str.split(","));
    }

    public static int setTryCount() throws IOException {
        System.out.println("시도할 회수는 몇회인가요?");

        String str = br.readLine();

        return Integer.parseInt(str);
    }
}
