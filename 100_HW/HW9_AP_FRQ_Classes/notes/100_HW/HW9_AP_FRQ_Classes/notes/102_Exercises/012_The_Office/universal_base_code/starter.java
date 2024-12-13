/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee Dwight = new Employee(1987,"Dwight", "Schrute", 4416.66);
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
	    Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee Pranav = new Employee(1234, "Pranav", "Arunachalam", 1);
		Dwight.raiseSalary(5);
		Jim.raiseSalary(5);
		Pam.raiseSalary(5);
		Pranav.raiseSalary(10);
		Dwight.employeeToString();
		System.out.println("Dwight's annual salary is "+Dwight.getAnnualSalary());
		Jim.employeeToString();
		System.out.println("Jim's annual salary is "+Jim.getAnnualSalary());
		Pam.employeeToString();
		System.out.println("Pam's annual salary is "+Pam.getAnnualSalary());
		Pranav.employeeToString();
		System.out.println("Pranav's annual salary is "+Pranav.getAnnualSalary());
	}
}
