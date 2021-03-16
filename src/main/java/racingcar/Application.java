package racingcar;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

    }

    private static String[] inputCarNames(Scanner scanner){
        return scanner.next().split(",");
    }

    private static int inputMoveCount(Scanner scanner) {
        return scanner.nextInt();
    }
}
