package array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		double[] arr1 = new double[3];
		System.out.println("Enter the number : ");
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextDouble();
		}
		
		double arrayAddition = Array.arraySum(arr1);
		System.out.println("sum : "+arrayAddition);
		
	}
	
	public static double arraySum(double[] a) {
		double total = 0.0;
		for(int i = 0; i<a.length;i++) {
			total = total + a[i];
		}
		return total;
	}

}
