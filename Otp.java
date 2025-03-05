import java.util.*;

public class Otp {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000); // Ensures a 6-digit OTP (100000 - 999999)
    }

    // Method to generate 10 OTPs and store them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        int counter=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if (otps[i] == otps[j]) {
                    counter++;
                }
        }}
        return counter==10;
    }

    public static void main(String[] args) {
        int[] otpArray = generateMultipleOTPs(10); // Generate 10 OTPs
        
        // Display the OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Validate uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTPs are unique ");
        } else {
            System.out.println("\nDuplicate OTPs found ");
        }
    }
}
