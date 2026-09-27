//calculator to perform division
import java.util.Scanner;

class Runtime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
				
		System.out.println("enter first digit : ");
		int a = sc.nextInt();
		System.out.println("enter second digit : ");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println("output : "+ c );

		System.out.println("program ended");
	}
}
