
public class FizzBuzz2 {

    public String sendAndReturn2(int number) {
        String result = "" + number;
        if (div3to5(number)) {
            result = "FizzBuzz";
        } else if (div3(number)) {
            result = "Fizz";
        } else if (div5(number)) {
            result = "Buzz";
        }
        return result;
    }

    private boolean div3to5(int number) {
        return div3(number) && div5(number);
    }

    private boolean div5(int number) {
        return number % 5 == 0;
    }

    private boolean div3(int number) {
        return number % 3 == 0;
    }

}
