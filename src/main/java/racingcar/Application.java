package racingcar;

import utils.RandomUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static utils.RandomUtils.*;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

        createCars(inputCarNames(scanner));

    }

    public static Map<String, Car> createCars(String[] carNames) {
        Map<String, Car> cars = new HashMap<>();

        for (String carName : carNames) {
            cars.put(carName, new Car(carName));
        }

        return cars;
    }

    public static int random() {
        return nextInt(0, 9);
    }

    private static String[] inputCarNames(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요.\n(이름은 쉼표(,) 기준으로 구분)");
        return scanner.next().split(",");
    }

    private static int inputMoveCount(Scanner scanner) {
        return scanner.nextInt();
    }
}
