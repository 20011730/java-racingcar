package domain;

public class TryCount {
    private static final int MINIMUM = 1;
    private int tryCount;

    // 시도 횟수
    public TryCount(int count){
        if (count < MINIMUM)
            throw new IllegalArgumentException("[ERROR]");

        this.tryCount = count;
    }

    // 시도 횟수 반환
    public int getTryCount(){
        return tryCount;
    }
}
