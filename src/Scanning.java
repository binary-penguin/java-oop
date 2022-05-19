import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first_name = scanner.next();
        // .next reads token by token, token delimiter is " "
        String last_name = scanner.next();
        // if you want to cast it to int, double auto use .nextDouble
        double height = scanner.nextDouble();

        // You can chain methods of next
        String country = scanner.next().toLowerCase();

        System.out.println(first_name + " " + last_name + " " + height + " " + country);

    }
}
