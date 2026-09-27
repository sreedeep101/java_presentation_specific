//area of rectangle with logical error

import java.util.Scanner;

class LogicError{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the width : ");
		int width = sc.nextInt();
		System.out.println("enter the length : ");
		int length = sc.nextInt();
		
		int area = width + length; //usage of + instead of *
		System.out.println("Area : " + area);
	}
}
