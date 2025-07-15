package drive;

import java.util.Scanner;

public class DrivingCost {
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the total miles per day:");
		Scanner sc = new Scanner(System.in);
		double miles = sc.nextDouble();
		System.out.println("Enter the cost per gallon of gasoline:");
		double costGal = sc.nextDouble();
		System.out.println("Enter the Average miles per gallon:");
		double avgMile = sc.nextDouble();
		System.out.println("Enter the Parking Fees per day: ");
		double fees = sc.nextDouble();
		System.out.println("Enter the Tolls: ");
		double toll = sc.nextDouble();
		
		System.out.println("total cost: "+calCost( miles, costGal, avgMile, fees, toll));
		//calCost();

	}


	

	private static double calCost(double m, double c, double a, double f, double t) {
		// TODO Auto-generated method stub
		double used = m/a;
		double cost=c*used;
		double total = cost + f + t;
		return total;
	}

}
