package racingcar;

import java.util.*;

import static utils.RandomUtils.nextInt;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

        String[] carNames = inputCarNames(scanner);
        int moveCount = inputMoveCount(scanner);
        start(carNames, moveCount);
    }

    public static Map<String, Car> start(String[] carNames, int moveCount) {
        Map<String, Car> cars = createCars(carNames);
        for (int i = 0; i < moveCount; i++) {
            carsMove(cars);
        }
        return cars;
    }

    public static Map<String, Car> carsMove(Map<String, Car> cars) {
        for (String s : cars.keySet()) {
            printRacing(s, cars.get(s).move(random()));
        }
        System.out.println();
        return cars;
    }

    public static void printRacing(String carName, int position) {
        String printPosition = "";
        for (int i = 0; i < position; i++) {
            printPosition += "-";
        }
        System.out.println(carName + " : " + printPosition);
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
        return scanner.nextLine().split(",");
    }

    private static int inputMoveCount(Scanner scanner) {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
