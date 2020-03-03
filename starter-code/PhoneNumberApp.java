/*
	This code was developed by Professor Mohan. 
	All work is mine unless otherwise cited. 
	The code below automatically generates a random sequence
	of phone number starting with 814 area code, except one 
	number. That number is a fake one.  
*/

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
public class PhoneNumberApp{
	public static BigInteger[] generatePhoneNos(BigInteger[] phone_numbers){
		Random rand = new Random(); 
		BigInteger fake_min = new BigInteger("2000000000");
		BigInteger min = new BigInteger("8140000000");
		BigInteger max = new BigInteger("8149999999");

		
		BigInteger bi1 = min.subtract(fake_min);
	    int len1 = min.bitLength();
  		BigInteger fake_number = new BigInteger(len1, rand);
	    if (fake_number.compareTo(fake_min) < 0)
	    	fake_number = fake_number.add(fake_min);
	    if (fake_number.compareTo(bi1) >= 0)
	    	fake_number = fake_number.mod(bi1).add(fake_min);
	    int fake_position = rand.nextInt(phone_numbers.length);
		for (int i = 0; i < phone_numbers.length; i++){
			BigInteger bi2 = max.subtract(min);
	    	int len2 = max.bitLength();
  			BigInteger genuine_number = new BigInteger(len2, rand);
	    	if (genuine_number.compareTo(min) < 0)
	    		genuine_number = genuine_number.add(min);
	    	if (genuine_number.compareTo(bi2) >= 0)
	    		genuine_number = genuine_number.mod(bi2).add(min);

			if (i != fake_position )
				phone_numbers[i] = genuine_number;
		}
		phone_numbers[fake_position] = fake_number;
		return phone_numbers;
	}
	public static BigInteger findFakeNo(BigInteger[] phone_numbers){
		/* find fake no here, you should print the phone number. */
		return new BigInteger("-1");
	}

	public static void main(String[] args){
		/* find a phone number that does not start with 814 */
		BigInteger[] phone_nos = new BigInteger[10]; // a set of phone numbers and their respective weights. 
		/* does a random distribution of weights, while still 
		making sure to be within the scope of the problem definition,
		that is, all values except one will be the same. 
		*/
		BigInteger[] phone_nos_filled = generatePhoneNos(phone_nos);
		System.out.println(Arrays.toString(phone_nos_filled));

		System.out.println("Fake:" + findFakeNo(phone_nos_filled));

	}
}