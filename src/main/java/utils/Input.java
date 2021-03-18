package utils;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String[] inputCarName() {
        return scanner.nextLine().split(",");
    }
}
