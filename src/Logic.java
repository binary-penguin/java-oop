public class Logic {
    public static void main(String[] args) {
        // AND -> &&, OR -> ||

        // Ternary operator
        int income = 120_000;

        String className = income > 100_000 ? "First" : "Economy";

        // switch case

        String role = "moderator";

        switch (role) {
            case "moderator":
                break;

            default:
                break;
        }

        // Foreach

        String[] fruits = { "Apple", "Banano", "Cedar", "Grape" };

        for (String fruit : fruits) {
            System.out.println("Fruit -> " + fruit);
        }

    }
}
