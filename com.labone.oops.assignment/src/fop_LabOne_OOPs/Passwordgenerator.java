package fop_LabOne_OOPs;
import java.util.Random;

public class Passwordgenerator {
//public static void main(String[] args) {
// assigning the length of password
//int passwordLength = 7;
// String password = passwordGenerator(passwordLength);

//}

//public static String passwordGenerator(int passwordLength) {
void password_generator() {
String Capital_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String Small_Letters = "abcdefghijklmnopqrstuvwxyz"; 
String numbers = "1234567890"; 
String symbols = "~!@#$%^&*()";
String combinedvalue = Capital_Letters + Small_Letters + numbers + symbols;
int passwordLength = 7;

Random random = new Random();
char[] password = new char[passwordLength];
for (int i = 0; i<password.length; i++) {
	password[i] = combinedvalue.charAt(random.nextInt(combinedvalue.length()));
	}
//return String.valueOf(password);
System.out.println(String.valueOf(password));
}


//return combinedvalue;
}

