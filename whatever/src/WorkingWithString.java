
public class WorkingWithString {

    public static void main(String[] args) {
       String name = "Thutpoom";
       int age = 23;
       System.out.println(name + age);
       String result = name + " " + age;
       String result2 = String.format("%s %d ", name , age);
       
       StringBuffer buffer = new StringBuffer();
       buffer.append(name).append(" ").append(age);
       
       StringBuilder builder = new StringBuilder();
       builder.append(name).append(" ").append(age);
       
       System.out.println(result);
       System.out.println(result2);
       System.out.println(buffer);
       System.out.println(builder);
      
    }

}
