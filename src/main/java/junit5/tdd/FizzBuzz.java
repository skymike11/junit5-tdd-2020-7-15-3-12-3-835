package junit5.tdd;

public class FizzBuzz {

    public String countOff(int number) {

        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
