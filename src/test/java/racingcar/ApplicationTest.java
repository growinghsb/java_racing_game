package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void Car객체_Move_Test() {
        //given (~ 가정했을 때)
        Car car = new Car("test");

        //when (~ 할 때), then (그렇다면)
        int position = car.move(3);
        assertThat(position).isZero();

        position = car.move(4);
        assertThat(position).isEqualTo(1);
    }

}