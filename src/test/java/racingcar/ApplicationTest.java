package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static racingcar.Application.*;

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

    @Test
    public void createCar_Method_Test() {
        //given (~ 가정했을 때)
        Map<String, Car> cars = createCars(new String[]{"sb", "hsb"});

        //when (~ 할 때), then (그렇다면)
        assertThat(cars.get("sb")).isNotNull();
        assertThat(cars.get("hsb")).isNotNull();
    }

    @Test
    public void 랜덤_값_출력_테스트() {
        for (int i = 0; i < 100; i++) {
            //given (~ 가정했을 때)
            int random = random();

            //when (~ 할 때), then (그렇다면)
            assertThat(random).isGreaterThanOrEqualTo(0);
            assertThat(random).isLessThanOrEqualTo(9);
        }
    }
}