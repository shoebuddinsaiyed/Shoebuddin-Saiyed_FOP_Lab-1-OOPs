package fop_LabOne_OOPs;
import java.util.Random;

public class Passwordgenerator {
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

System.out.println(String.valueOf(password));
}
}

