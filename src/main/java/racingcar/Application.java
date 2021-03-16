package racingcar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

    }

    public static Map<String, Car> createCars(String[] carNames) {
        Map<String, Car> cars = new HashMap<>();

        for (String carName : carNames) {
            cars.put(carName, new Car(carName));
        }

        return cars;
    }

    private static String[] inputCarNames(Scanner scanner){
        return scanner.next().split(",");
    }

    private static int inputMoveCount(Scanner scanner) {
        return scanner.nextInt();
    }
}
