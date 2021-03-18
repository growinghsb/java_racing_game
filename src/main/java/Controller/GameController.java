package Controller;

import View.Progress;
import racingcar.Car;
import utils.Input;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    private int gameCount;
    private List<Car> cars = new ArrayList<>();

    public GameController() {


        createCars(inputCarName());
        gameCount = Input.inputGameCount();
    }

    public void start() {
        for (int i = 0; i < gameCount; i++) {
            for (Car car : cars) {
                car.move(RandomUtils.nextInt(0, 9));
                Progress.drawStatus(car.getStatus());
            }
            System.out.println();
        }
    }

    private String[] inputCarName() {
        return Input.inputCarName();
    }

    private void createCars(String[] carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }
}
