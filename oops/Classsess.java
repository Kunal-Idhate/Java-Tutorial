/**
 * Classsess
 */

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }
}

public class Classsess {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color="Green";
        p1.type ="Ballpen";
        p1.write();
    }
}