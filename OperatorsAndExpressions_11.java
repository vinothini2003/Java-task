// 11).Determine if a given character ch is an uppercase letter.
public class OperatorsAndExpressions_11{
	public static void main(String[] args){
	char ch = 'A';
		if(Character.isUpperCase(ch)){
		    System.out.println("The character in upper case : " + ch);
		}
		else{
		    System.out.println("The character doesn't upper case" );
		}	   	
	}
}
// 12).Convert temperature from Celsius to Fahrenheit using the formula F = (C × 9/5) + 32.
public class OperatorsAndExpressions_12{
	public static void main(String[] args){
	  double celsius = 10d;
      double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit); 	  
	}
}
// output => 50.0

// 13).Determine if an integer num is a multiple of 5.
public class OperatorsAndExpressions_13{
	public static void main(String[] args){
		int num = 20;
		if(num % 5 == 0){
			System.out.println("The given number is divisible by 5 : " + num);
		}
		else{
			System.out.println("The given number is not divisible by 5 : " + num);
		}       	
	}
}

// 14).Calculate the perimeter of a square with side length side.
// Perimeter of the Square (P) =  4 * Side
public class OperatorsAndExpressions_14{
	public static void main(String[] args){
	   	double side = 15;
		double perimeter = 4*side;
		System.out.println(perimeter);
	}
}
// output => 60.0

// 15).Determine the result of the expression (10 > 5) && (8 < 3).
public class OperatorsAndExpressions_15{
	public static void main(String[] args){
	   	boolean result = (10 > 5) && (8 < 3);
		System.out.println(result);
	}
}
// output => false

// 16).Determine the result of the expression (true || false) && (true && false).
public class OperatorsAndExpressions_16{
	public static void main(String[] args){
	 boolean result = (true || false) && (true && false); 
     System.out.println(result);	 
	}
}
// output => false

// 17).Evaluate the expression (4 * 3) == (6 * 2).
public class OperatorsAndExpressions_16{
	public static void main(String[] args){
	  boolean result = (4 * 3) == (6 * 2);
	  System.out.println(result); 	
	}
}
// output => true

// 18).Determine the result of the expression !(5 >= 10).
public class OperatorsAndExpressions_18{
	public static void main(String[] args){
	  	boolean result = !(5 >= 10);
	    System.out.println(result); 
	}
}
// output => true

// 19).Calculate the square of a number x.
public class OperatorsAndExpressions_19{
	public static void main(String[] args){
	 int x = 5;
	 int square = x*x;
	 System.out.println(square);
	}
}
// output => 25

// 20).Determine the result of the expression (7 != 5) || (3 <= 3).
public class OperatorsAndExpressions_20{
	public static void main(String[] args){
	  boolean result = (7 != 5) || (3 <= 3);
	  System.out.println(result);
		   	
	}
}
// output => true

// 21).write an expression to calculate the area of a circle with radius r.
// Area of circle = pi * r^2
public class OperatorsAndExpressions_21{
	public static void main(String[] args){
		double radius = 4.0d ;
	    double pi = Math.PI;
		double area = pi*radius * radius;
		System.out.println("area of the circle:"+area);
	   	
	}
}
// output => 50.2654

// 22).Calculate the value of the expression (5 + 3) * 2.
public class OperatorsAndExpressions_22{
	public static void main(String[] args){
		int num = (5 + 3) * 2;
		System.out.println(num);
	   	
	}
}
// output => 16

// 23).Determine the result of the expression (10 - 4) / 2.
public class OperatorsAndExpressions_23{
	public static void main(String[] args){
	    int num = (10 - 4) / 2;
		System.out.println(num);
}
}
// output => 3

// 24).Evaluate the expression 2 * (3 + 4) - 5.
public class OperatorsAndExpressions_24{
	public static void main(String[] args){
	   	int num = 2 * (3 + 4) - 5;
		System.out.println(num);
	}
}
// output => 9
// 25).write an expression to  convert temperature from celcius to fahrenheit using the formula F=(c*9/5)+32
public class OperatorsAndExpressions_25{
	public static void main(String[] args){
	  double celsius = 2d;
      double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit); 	  
	}
}
// output => 35.6

// 26).Calculate the average of three numbers num1, num2, and num3.
// average =sum of numbers/total
public class OperatorsAndExpressions_26{
	public static void main(String[] args){
		int num1=6;
	    int num2=8;
	    int num3=78;
		int total=num1+num2+num3;
		int average=total/3;
		System.out.println(average);
}
}
//output => 30
// 27).Determine if a given number x is greater than 10 and less than 20.
public class OperatorsAndExpressions_27{
	public static void main(String[] args){
		int x=36;
		if (x >10 && x<20){
		System.out.println("True");
		}
		else{
		System.out.println("False");
       }
}
}
// output => false

// 28).Calculate the volume of a cylinder given its radius r and height h.
// volume of cyclinder = pi*radius*radius*height.
public class OperatorsAndExpressions_28{
	public static void main(String[] args){
		double radius=8.9d;
		double height=5d;
		double pi=Math.PI;
		double volume=pi*radius*radius*height;
		System.out.println(volume);
}
}
//output => 1244.24777

// 29).Determine the result of the expression 5 * 3 - 2 / 4.
public class OperatorsAndExpressions_29{
	public static void main(String[] args){
		int num=5*3-2/4;
		System.out.println(num);
	}
}
// output =>15

// 30).Write an expression to calculate the square root of a number x.
  public class OperatorsAndExpressions_29{
	public static void main(String[] args){
		double x=9;
		double square =Math.sqrt(x);
		System.out.println(square);
	}
}
//output =>3.0
		