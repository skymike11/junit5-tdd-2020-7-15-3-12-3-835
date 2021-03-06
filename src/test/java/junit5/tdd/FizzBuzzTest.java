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

    @Test
    void should_return_3_when_counting_off_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;

        //when
        String result = fizzBuzz.countOff(inputNumber);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_5_when_counting_off_given_the_multiples_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;

        //when
        String result = fizzBuzz.countOff(inputNumber);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_15_when_counting_off_given_the_multiples_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;

        //when
        String result = fizzBuzz.countOff(inputNumber);

        //then
        assertEquals("FizzBuzz", result);
    }
}