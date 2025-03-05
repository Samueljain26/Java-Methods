import java.util.*;
 class Bonus {

    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newEmployeeData = new double[employeeData.length][2]; // [][0] - new salary, [][1] - bonus

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            newEmployeeData[i][0] = newSalary;
            newEmployeeData[i][1] = bonus;
        }

        return newEmployeeData;
    }

    public static void calculateAndDisplaySums(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double yearsOfService = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f\n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }
        System.out.println("\nTotal Sums:");
        System.out.printf("Sum of Old Salary: \n", sumOldSalary);
        System.out.printf("Sum of New Salary: \n", sumNewSalary);
        System.out.printf("Total Bonus Amount: \n", totalBonus);
    }
    public static void main(String[] args) {
        int employees = 10;
        double[][] employeeData = new double[employees][2]; // [][0] - salary, [][1] - years of service
        Random rand = new Random();

        // Initialize employee data with random salary and years of service
        for (int i = 0; i < employees; i++) {
            employeeData[i][0] = 50000 + rand.nextInt(50000); // Salary between 50,000 and 99,999
            employeeData[i][1] = rand.nextInt(11); // Years of service between 0 and 10
        }
        // Calculate new salary and bonus
        double[][] newEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Calculate and display the sums of old salary, new salary, and total bonus
        calculateAndDisplaySums(employeeData, newEmployeeData);
    }
}
