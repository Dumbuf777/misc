package miscStringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetOtpFromString {

	public static void main(String[] args) {

		String message = "the email otp is 25301 for 1 min";
		
		// Define the regular expression pattern to match the OTP value
		Pattern pattern = Pattern.compile("\\b\\d{5}\\b");
		
		// Create a Matcher object to find the pattern in the message
		Matcher matcher = pattern.matcher(message);
		
		// Check if a match is found
		if (matcher.find()) {
			// Get the matched value (OTP) and convert it to an integer
			String otpString = matcher.group();
			int otp1 = Integer.parseInt(otpString);
			// Print the OTP value
			System.out.println("OTP: " + otp1);
		} else {
			// If no match is found, print an error message
			System.out.println("OTP not found in the message.");
		}
		System.out.println("---------------------------");
		String otpString1= message.substring(17,21);
		System.out.println(otpString1);

	}

}
