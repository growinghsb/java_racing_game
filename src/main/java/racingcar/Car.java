package racingcar;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void move(int condition) {
        if (condition > 3) {
            position ++;
        }
    }

    public Map<String, Integer> getStatus () {
        Map<String, Integer> carInfo = new HashMap<>();
        carInfo.put(name, position);
        return carInfo;
    }
}
