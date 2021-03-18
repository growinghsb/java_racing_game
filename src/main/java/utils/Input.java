package utils;

import java.util.Scanner;

public class Input {

    private final static Scanner scanner = new Scanner(System.in);

    private Input() {}

    public static String[] inputCarName() {
        System.out.println("경주할 자동차 이름을 입력해주세요.\n이름은 ,(콤마)를 기준으로 구분.");
        return scanner.nextLine().split(",");
    }

    public static int inputGameCount() {
        System.out.println("경주할 횟수를 입력해주세요.");
        return scanner.nextInt();
    }
}
