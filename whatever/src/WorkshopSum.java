
public class WorkshopSum {

    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 1; i<=10 ; i++) {
           sum = sum+i;
        }
        System.out.println("------>Sum :"+sum);
        
        for(int i = 1; i<11 ; i=i+2) {
            sum2 = sum2+i;
        }
        System.out.println("------>Sum :"+sum2);

    }

}
