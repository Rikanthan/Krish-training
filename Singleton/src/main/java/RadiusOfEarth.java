class RadiusOfEarth {
   private static RadiusOfEarth radius;

   private RadiusOfEarth() {      
   }

   public static RadiusOfEarth getInstance() {

      if(radius == null) {
         radius = new RadiusOfEarth();
      }

       return radius;
   }

   public void getRadius() {
       System.out.println("you got radius of earth");
   }
}
