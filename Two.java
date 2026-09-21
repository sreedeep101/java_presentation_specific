//to demonstrate a program WITH exception handling.

//TRY , CATCH

import java.util.Scanner;

class Two{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();

        //try to execute the error code 
        try {
            int c = a/b; 
            System.out.println("Output : " + c);
        }
        catch (ArithmeticException e){   // catch block to catch the exception send from the try block
            System.out.println(e); //first method 
            System.out.println("Division by zero is not possible"); //user friendly error message
        }


        //code that after exception
        
        System.out.println("program ended");

    }
}