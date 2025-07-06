import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("Given Number : " + num);
		System.out.println("Binary Equivalence : " + Integer.toBinaryString(num));
		System.out.println("Octal Equivalence : " + Integer.toOctalString(num));
		System.out.println("Hexadecimal Equivalence : " + Integer.toHexString(num));
		

	}

}
