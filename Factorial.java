// import scanner method from util
import java.util.*;
class Factorial { 			

    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) //  logical code for factorial of number
            res *= i; 
        return res; 
    } 
  

    public static void main(String[] args)   // main method for input operation
    {  
	Scanner scr = new Scanner(System.in);
	System.out.println("enter factorial number");
	int num = scr.nextInt();
        System.out.println("Factorial of " + num + " is "
                           + factorial(num)); 
    } 
}
