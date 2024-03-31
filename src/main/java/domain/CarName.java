package domain;

public class CarName {
    private final String carName;

    public CarName(String name){
        if (name.length() > 7)
            throw new IllegalArgumentException("[ERROR]");

        this.carName = name;
    }

    public String getCarName(){
        return carName;
    }
}
