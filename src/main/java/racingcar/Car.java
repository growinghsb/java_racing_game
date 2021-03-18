package racingcar;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Car implements Comparable<Car>, Comparator<Car> {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void move(int condition) {
        if (condition > 3) {
            position++;
        }
    }

    public Map<String, Integer> getStatus() {
        Map<String, Integer> carInfo = new HashMap<>();
        carInfo.put(name, position);
        return carInfo;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public int compareTo(Car o) {
        return o.position - position;
    }

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.position - o2.position < 0) {
            return -1;
        }
        return 0;
    }
}
