import java.awt.Point;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // PRIMITIVE TYPES
        // We copy values and create new memory locations
        byte myAge = 30;
        long viewsCount = 3_123_456_789L; // add L suffix to indicate is Long default is int
        float price = 10.99F; // add F suffix to float, default is double
        char letter = 'A';
        boolean isEligible = false;

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        // REFERENCE TYPES
        // We copy a reference, basically we create pointers to the same address
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2.x);

    }
}
