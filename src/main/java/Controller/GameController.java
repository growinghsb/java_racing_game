package Controller;

import racingcar.Car;
import racingcar.Cars;
import utils.Input;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    private Input input;
    private Cars cars;

    public GameController() {
        this.input = new Input();
        String[] carNames = inputCarName();
        cars = new Cars(createCars(carNames));
    }

    public void start() {

    }

    private String[] inputCarName() {
        return input.inputCarName();
    }

    public List<Car> createCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }
}
