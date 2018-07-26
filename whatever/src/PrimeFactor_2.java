
public class PrimeFactor_2 {

    public String of(int number) {
        String result = "";
        if (number > 0) {
            if (number % 2 == 0) {
                result = result + "2";
                number = number / 2;
                if (number % 2 == 0) {
                    result = result + "2";
                    number = number / 2;

                } else if (number % 5 == 0) {
                    result = result + "5";
                    number = number / 5;
                }
            }
            if (number % 2 == 0) {
                result = result + "2";
                number = number / 2;
                if (number % 3 == 0) {
                    result = result + "3";
                    number = number / 3;
                }
            }
            if (number % 2 == 0) {
                result = result + "2";
                number = number / 2;
                if (number % 2 == 0) {
                    result = result + "2";
                    number = number / 2;
                    if (number % 2 == 0) {
                        result = result + "2";
                        number = number / 2;
                    }
                }
            }

            else if (number % 3 == 0) {
                result = result + "3";
            } else if (number % 2 == 0) {
                result = result + "2";
            }
        }

        return result;
    }

}
