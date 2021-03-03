public class CheckEquals {
     private int id;
     private String name;
     private double latitude;
     private double longitude;

     CheckEquals(int id, String name, double latitude, double longitude) {
          this.id = id;
          this.name = name;
          this.latitude = latitude;
          this.longitude = longitude;
     }

     public String toString() {
          return "Name: " + name + " Latitude: " + latitude + " Longitude: " + longitude;
     }

     @Override
     public boolean equals(Object object) {
          if (object instanceof Coordinate) {
               if (id == ((Coordinate) object).id) {
                    return true;
               } else if (longitude == ((Coordinate) object).longitude && latitude == ((Coordinate) object).latitude) {
                    return true;
               } else {
                    return false;
               }
          } else {
               return false;
          }
     }

     public static void main(String[] args) {
          Coordinate c1 = new Coordinate(1, "Kathmandu", 325.42, 298.36);
          System.out.println(c1.toString());

          Coordinate c2 = new Coordinate(1, "Butwal", 200.56, 298.36);
          System.out.println(c2.equals(c1));
     }
}