//to demonstrate a program without exception handling.

import java.util.Scanner;

class One{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();

        //code that making exception 

        int c = a/b; 
        System.out.println("Output : " + c);

        //code that after exception
        
        System.out.println("program ended");

    }
}