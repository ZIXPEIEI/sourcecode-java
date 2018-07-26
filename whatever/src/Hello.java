
public class Hello {

    public static void main(String... args) {
        // TODO Day1
        Hello hello = new Hello();
        hello.say(100);
    }
        //Constant
        private static final int NUMBER_ONE = 121;
      //Class variable
        static int index =10;
      //Instance variable
        private int number=0;
        
    private void say(int number) {
        // TODO Auto-generated method stub
        int index =0 ;//Local variable
        System.out.println(index);//0
        System.out.println(Hello.index);//10
        System.out.println(number);//100
        System.out.println(this.number);//0
        System.out.println(NUMBER_ONE);//121
    }

}
