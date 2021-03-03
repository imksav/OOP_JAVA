public class Coordinate {
     int id;
     private String name;
     double latitude;
     double longitude;

     Coordinate(int id, String name, double latitude, double longitude) {
          this.id = id;
          this.name = name;
          this.latitude = latitude;
          this.longitude = longitude;
     }

     public void setID(int id) {
          this.id = id;
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public double getLatitude() {
          return latitude;
     }

     public double getLongitude() {
          return longitude;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setLatitude(double latitude) {
          this.latitude = latitude;
     }

     public void setLongitude(double longitude) {
          this.longitude = longitude;
     }

     public String toString() {
          String result = String.format("Id: %d\nName: %s\nLatitude: %f\nLongitude: %f", getId(), getName(),
                    getLatitude(), getLongitude());
          return result;
     }

     public static void main(String[] args) {
          System.out.println("++++++++++++++++++Displaying the information++++++++++++++++++");
          Coordinate c1 = new Coordinate(1, "Keshav Bhandari", 96.58, 28.35);
          System.out.println(c1.toString());
     }
}
