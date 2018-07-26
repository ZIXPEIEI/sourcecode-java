
public class PrimeFactor_3 {
    public String of(int number) {
        String result = "";
        for (int primeNumber = 2; number > 1; primeNumber++) {
            for (; number % primeNumber == 0; number = number / primeNumber) {
                result = result + primeNumber;
            }
        }
        return result;
    }
}
