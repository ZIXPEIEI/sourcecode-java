
public class WorkingWithLoop {

    public static void main(String[] args) {
        for(int i=0; i<5;i++) {
            System.out.println("hello");
        }
        System.out.println("-----------");
        int i =0;   
        while(i<5) {
            System.out.println("hi");
            i++;
        }
        System.out.println("-----------");
        i =0;
        do {
            System.out.println(i);
            i++;
        }while(i<5);
    }

}
