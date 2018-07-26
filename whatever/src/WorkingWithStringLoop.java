
public class WorkingWithStringLoop {

    public static void main(String[] args) {
       String name = "Tutpoom2018";
       
       for (;name.length()>0;) {
           //System.out.println(name.charAt(i));
           System.out.println(name.substring(0,1));
           name = name.substring(1);
           System.out.print(name);
    }
    }

}




