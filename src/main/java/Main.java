public class Main {
    public static void main(String[] args) {
        double principal = 200000.0;   // Loan amount (€)
        double monthlyRate = 0.002425; // 2.91% annual / 12
        int months = 360;              // 30 years * 12

        // Precomputed (1 + 0.002425)^360 ≈ 2.435
        double power = 2.435;

        double numerator = monthlyRate * power;
        double denominator = power - 1.0;
        double monthlyPayment = principal * (numerator / denominator);

        System.out.println("With a mortgage of: " + principal + ",");
        System.out.println("a monthly rate of: " + monthlyRate + ",");
        System.out.println("and a " + months + "months loan:");
        System.out.println("Your monthly payment is: " + monthlyPayment + "€");
    }
}