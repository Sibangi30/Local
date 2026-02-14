import java.util.Scanner;

// Define the interface
interface Salary {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

// Manager class implements Salary but does not implement bonus()
abstract class Manager implements Salary {
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic); // basic + DA + HRA
    }

    public double deductions(double basic) {
        return 0.12 * basic; // PF
    }

    // bonus() left abstract
    public abstract double bonus(double basic);
}

// Substaff extends Manager and implements bonus()
class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.5 * basic; // 50% of basic
    }
}

// Main class
public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        // Create Substaff object
        Substaff s = new Substaff();

        // Output
        System.out.println("Earnings: " + s.earnings(basic));
        System.out.println("Deduction: " + s.deductions(basic));
        System.out.println("Bonus: " + s.bonus(basic));

        sc.close();
    }
}

