// 1). Write an expression to add two integers a and b.
public class OperatorsAndExpressions_01{
	public static void main(String[] args){
		int a=15;
		int b= 10;
		System.out.println(a+b);
	}
}
// output => 25

// 2).Calculate the reminder when dividing an integer dividend by another integer divisor.
 public class OperatorsAndExpressions_02{
	public static void main(String[] args){
		int dividend = 25;
		int divisor = 10;
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		System.out.println("The Quotient is :"+quotient);
		System.out.println("The Remainder is :"+remainder);
	}
}
// output =>  quotient : 2
// output =>  reaminder : 5 

// 3).Evaluate the expression 5 * (10 + 3).
 public class OperatorsAndExpressions_03{
    public static void main(String[] args){
		int a=5;
		int b=10;
		int c=3;
		System.out.println(a*(b+c));
	}
 }
// output =>65
 
// 4). Find the result of the expression (8 - 3) * 2 / 5.
 public class OperatorsAndExpressions_04{
    public static void main(String[] args){
		int a=8;
		int b=3;
		int c=2;
		int d=5;
		System.out.println((a-b)*(c/d));
	}
 }
 // output => 0
  
public class OperatorsAndExpressions_04{
public static void main(String[] args){
	int result = ((8 - 3) * (2 / 5));
	System.out.println(result);
}
}
// output => 2
 
 
// 5).Determine the value of the expression 10 % 3.
public class OperatorsAndExpressions_05{
public static void main(String[] args){
	int a,b;
	System.out.println(10%3);
}
}
// output => 1

// 6).Calculate the average of two numbers num1 and num2.
public class OperatorsAndExpressions_06{
public static void main(String[] args){
	int num1 = 10;
	int num2 = 20;
	int avg = (num1+num2)/2;
	System.out.println("The Average of two numbers is :"+avg);
}
}
// output => 15

// 7).Determine whether an integer number is even or odd.
import java.util.Scanner;
public class OperatorsAndExpressions_07{
   public static void main(String[] args){
	   int number;
	   System.out.println("Enter any number");
	    
	   Scanner sc = new Scanner(System.in);
	   number = sc.nextInt();
	   
	   if(number%2 ==0){
	       System.out.println("The given number is Even");
	   }
	   else{
		   System.out.println("The given number is Odd");
	   }
}
}

// 8).Calculate the area of a rectangle with length length and width width.
// Area of Rectangle = length * width.
public class OperatorsAndExpressions_08{
   public static void main(String[] args){
	   double length = 12d;
	   double width = 10d;
	   double rectangle = length * width;
	   System.out.println(rectangle);
	   
   }
}
// output => 120.0

// 9).Determine if an integer year is a leap year.
public class OperatorsAndExpressions_09{
   public static void main(String[] args){
	   int year;
	   System.out.println("Enter the Year");
	    
	   Scanner sc = new Scanner(System.in);
	   year = sc.nextInt();
	   
	   if(year%4 ==0){
	       System.out.println("The " +year + " is Leap Year");
	   }
	   else{
		   System.out.println("The " +year + " is not a Leap Year");
	   }
	   
   }
}
// 10).Calculate the hypotenuse of a right triangle given the lengths of its two legs a and b
// Hypotenuse c = (a^2 +b^2)^1/2.
public class OperatorsAndExpressions_10{
   public static void main(String[] args){
	   double a = 3d;
	   double b = 4d;
	   double hypotenuse = Math.sqrt(a*a + b*b);
	   System.out.println("The Hypotenuse of the right angle triangle is :" + hypotenuse);
	   
   }
}
// output => 5