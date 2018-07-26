
class space3D{  
    double longway(Point3D startPoint , Point3D endPoint) {
        int exponent = 2;
        double x = Math.pow((startPoint.x - endPoint.x) ,exponent);
        double y = Math.pow((startPoint.y - endPoint.y) ,exponent);
        double z = Math.pow((startPoint.z - endPoint.z) ,exponent);
        double distance = Math.sqrt(x + y +z);
        return distance;
        
        
    }
}
class Point3D{
   
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int x;
    int y;
    int z;
}


public class Workshop001 {
    
    public static void main(String... args) {
        int a ,b ,c = 0;
        a = c++;
     //   System.out.println(a+ "" +c);
        b = ++a;
     //   System.out.println(b+ "" +a);
        c++;
      //  System.out.println(c);
        b = ++c + a++;
     //   System.out.println(b + "" +c +""+a);
        a = --b + c++;
      //  System.out.println(a + "" + b + "" + c);
        
     //   System.out.println(a);
     //   System.out.println(b);
      //  System.out.println(c);
       
 
        space3D Space3D = new space3D();
        Point3D startPoint = new Point3D(2,1,3);
        Point3D endPoint= new Point3D(0,0,6);
        double distance = Space3D.longway(startPoint, endPoint);
        System.out.println(distance);
        
       
        //System.out.println(Math.sqrt(x + y + z));
        
    }
}
