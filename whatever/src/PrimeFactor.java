
public class PrimeFactor {

    public String of(int number) {
        String result = "";
        int primeNumber =2 ;
        while(number>1) {
            while(number%primeNumber==0) {
                result = result + primeNumber;
                number = number / primeNumber;
            }
            primeNumber++;
        }

        return result;
    }

}
