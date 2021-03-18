package utils;

import racingcar.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Winner {

    private List<Car> cars;
    private int PLAYER;

    public Winner(List<Car> cars) {
        this.cars = cars;
        PLAYER = cars.size();
    }

    public void racingWinner() {
        carSort();

        StringBuilder sb = new StringBuilder();
        sb.append("우승자 : ");

        for (Car car : cars) {
            sb.append(car.getName()).append(" ");
        }

        System.out.println(sb);
    }

    private void carSort() {
        Collections.sort(cars);
        for (int i = 1; i < cars.size(); i++) {
            if (cars.get(0).getPosition() > cars.get(i).getPosition()) {
                cars.removeAll(new ArrayList<>(cars.subList(i, PLAYER)));
                return;
            }
        }
    }
}