//to demonstrate a program WITH exception handling.

//compleate trow throws

import java.util.Scanner;

class Three{

    //i have created another fuction to perform trows trow 

    public static void divide(int a, int b)throws ArithmeticException{//declaring exception
        if (b == 0){
            throw new ArithmeticException("Division by zero is not possible");
        }
        else {
            double c = (double)a/b;
            System.out.println("Output : " + c);
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();

        //try to execute the error code 
        try{
            divide(a,b);
        }
        catch (ArithmeticException e){   // catch block to catch the exception send from the try block
            System.out.println(e); //first method trowing error custom
            //System.out.println("Division by zero is not possible"); //user friendly error message
        }
        finally {
            System.out.println("division handled sucessfully");
        }


        //code that after exception
        
        System.out.println("program ended");

    }
}