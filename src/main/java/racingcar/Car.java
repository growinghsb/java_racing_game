package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public int move(int random) {
        if (random >= 4) {
            return position + 1;
        }
        return position;
    }
}
