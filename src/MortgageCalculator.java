import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interest_rate = (scanner.nextDouble() / 100) / 12;
        System.out.print("Period (years): ");
        int period = scanner.nextInt() * 12;

        double up = interest_rate * Math.pow((1 + interest_rate), period);
        double bottom = Math.pow((1 + interest_rate), period) - 1;
        double mortage = (double) principal * (up / bottom);
        String m_formatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(m_formatted);
        scanner.close();
        

    }

}
