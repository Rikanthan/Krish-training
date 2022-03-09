
public class CheckSingleTon {
   public static void main(String[] args) {
      RadiusOfEarth radius;

      radius= RadiusOfEarth.getInstance();
      
      radius.getRadius();
   }
}