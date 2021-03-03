public interface Movable {
     void moveUp();

     void moveDown();

     void moveLeft();

     void moveRight();

     public static void main(String[] args) {

          Moveablepoint info = new Moveablepoint(10, 20);
          System.out.println(info.toString());
          info.moveLeft();
          info.moveUp();

     }

}

class Moveablepoint implements Movable {
     private int x;
     private int y;

     public Moveablepoint(int x, int y) {
          this.x = x;
          this.y = y;
     }

     @Override
     public void moveUp() {

          System.out.println("Upside Movement = " + this.y);

     }

     @Override
     public void moveDown() {

          System.out.println("Downside Movement = " + -this.y);

     }

     @Override
     public void moveLeft() {

          System.out.println("Left Movement = " + -this.x);

     }

     @Override
     public void moveRight() {

          System.out.println("Right  Movement = " + this.x);
     }

     public String toString() {
          return ("[Move up = " + this.y + ", Move Down = " + -this.y + ", Move Right = " + this.x + ", Move Left = "
                    + -this.x + " ]");
     }

}