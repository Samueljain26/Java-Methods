import java.util.Scanner;

class Calendar {

    // Array of month names
    private static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    // Array to store the number of days in each month
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return daysInMonth[month];
    }
    // Method to get the first day of the month using Zeller's Congruence algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 2) {
            month += 12;
            year -= 1;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }
    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);
        // Print leading spaces for the first week
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        // Print the days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1; // Convert to 0-based index
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        // Display the calendar
        displayCalendar(month, year);
    }
}
