/* Pretema Dharampaul
 * COP3330 Due 9/22/19
 * 
 * Write a program that encrypts and decrpyts a 4 digit number
 * 
 */
import java.util.Scanner;

public class Dharampaul_p1 {
	 public static void main(String args[]) {
		 
//Encryption Application 
		 
		 //initialize variables
	      int digit1;
	      int digit2;
	      int digit3;
	      int digit4;
	      int digits;
	     //Asks for input and scan into variable
	      System.out.println("Enter 4 digit number:");
	      Scanner scnr = new Scanner(System.in);
	      digits = scnr.nextInt();
	     //Store digits in variables
	      digit1=digits/1000;
	      digit2=(digits%1000/100)%10;
	      digit3=(digits%100/10)%10;
	      digit4= (digits%10);
	     //Manipulate digits to create encryption
	      digit1= (digit1+7)%10;
	      digit2= (digit2+7)%10;
	      digit3= (digit3+7)%10;
	      digit4= (digit4+7)%10;
	     //Print Encyrpted Digits
	      System.out.print(digit1);
	      System.out.print(digit2);
	      System.out.print(digit3);
	      System.out.println(digit4);
	      
	//Decrypted Program
	     //Initialize variables
	      int decode1;
	      int decode2;
	      int decode3; 
	      int decode4;
	      int decode;
	     //Asks for input and scan into variable.
	      System.out.println("Entered Encrypted digits: ");
	      decode = scnr.nextInt();
	      decode1=decode/1000;
	      decode2=(decode%1000/100)%10;
	      decode3=(decode%100/10)%10;
	      decode4= (decode%10);
	      
	      decode1= (decode1+3)%10;
	      decode2= (decode2+3)%10;
	      decode3= (decode3+3)%10;
	      decode4= (decode4+3)%10;
	      
	      System.out.print(decode1);
	      System.out.print(decode2);
	      System.out.print(decode3);
	      System.out.print(decode4);

	      scnr.close();
	      
	      
	    }
	}