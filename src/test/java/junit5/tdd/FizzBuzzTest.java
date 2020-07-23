package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzTest {

    @Test
    void should_return_1_when_counting_off_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;

        //when
        String result = fizzBuzz.countOff(inputNumber);

        //then
        assertEquals("1", result);
    }
}