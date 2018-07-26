
public class WorkshopStars {

    public static void main(String[] args) {
       
        int start=9;
        line1(start);
        newline();
        
        line2(start);
        newline();
       
        for (int round = 0; round < 5; round++) {
            int reduce = 2;
            generateSpace(round);
            generateStar(start);
            newline();
            start=start-reduce;
        }
    }

    private static void line2(int start) {
        for (int i = 0; i < start; i++) {        
           if(i==start/2) {
               System.out.print(" ");
           }else {
               System.out.print("*");
           }
        }
    }

    private static void line1(int start) {
        for(int i=1;i<start;i++) {
                if(i==2 || i==3||i==7||i==8) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
    }

    private static void newline() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for(int space = 0; space<round; space++) {
            System.out.print(" ");
        }
    }

}
