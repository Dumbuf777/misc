package miscRandomGenrate;

public class genrateOTP {

	public static String generateOTP() {
		int randomPin = (int) (Math.random() * 9000) + 1000;
		String otp = String.valueOf(randomPin);
		return otp;
	}

	public static void main(String[] args)   {
	        	  
		int randomPin = (int) (Math.random() * 9000) + 1000;
		String otp = String.valueOf(randomPin);
		System.out.println("OTP : " + otp);
		System.out.println("-----------------------------");
		String otpSting = generateOTP();
		System.out.println("OTP : " + otpSting);

	}
}
