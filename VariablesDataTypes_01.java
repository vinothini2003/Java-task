// 1). Declare a variable of type int named age and assign it the value 25.

 public class VariablesDataTypes_01{
    public static void main (String[] args){
        int age = 25;
        System.out.println(age);
    }   
}


// 2). Create a variable of type double named temperature and assign it the value 98.6.

 public class Variables_02{
    public static void main (String[] args){
       double temperature = 98.6;
       System.out.println(temperature);
    }
}


// 3). Declare a variable of type boolean named isRaining and assign it the value true.

public class Variables_03{
    public static void main (String[] args){
      boolean isRaining = true;
       System.out.println(isRaining);
    }
}


// 4). Create a variable of type char named grade and assign it the value 'A'.

public class Variables_04{
    public static void main (String[] args){
     char grade = 'A';
       System.out.println(grade);
    }
}


// 5). Declare a variable of type String named name and assign it the value "John Doe".

public class Variables_05{
    public static void main (String[] args){
     String name = " Vinothini ";
       System.out.println(name);
    }
}


// 6). Initialize three variables num1, num2, and num3 of type int with values 10, 20, and 30 respectively.

public class Variables_06{
    public static void main (String[] args){
     int num1 = 10;
	 int num2 = 20;
	 int num3 = 30;
       System.out.println(num1);
	   System.out.println(num2);
	   System.out.println(num3);
    }
}


// 7). Create a variable pi of type double and assign it the value of pi (use the Math.PI constant).

public class Variables_07{
    public static void main (String[] args){
     double pi = Math.PI;
       System.out.println(pi);
    }
}


// 8). Declare a variable isEven of type boolean and assign it the result of checking whether num1 is an even number.

public class Variables_08{
    public static void main (String[] args){
		boolean isEven = true;
        if(isEven == true){
		System.out.println("Whether num1 is even :" +isEven);	   
    }
	}
}


//9). Initialize a variable initial of type char with the initial letter of your first name.

public class Variables_09{
    public static void main (String[] args){
		char initial = 'v';
    
       System.out.println(initial);
	 }    
}


// 10). Declare a variable city of type String and assign it the name of your favorite city.

public class Variables_10{
    public static void main (String[] args){
		String city = "Villupuram";
    
       System.out.println(city);
	}    
}


 //  11). Create a variable isPalindrome of type boolean and assignit the result of checking whether the string "madam" is a palindrome.
  
public class Variables_11{
    public static void main (String[] args){
		String name = "madam";
		boolean isPalindrome = true;
		int length =  name.length();
		
		for (int i=0 ; i<length/2 ; i++){
			if(name.charAt(i) != name.charAt(length - i - 1)){
				isPalindrome = false;
				
			}
		}
    
       System.out.println(isPalindrome);
	
    }    
}


// 12).Initialize variables length and width of type double with values 5.5 and 2.5 respectively.

public class Variables_12{
public static void main (String[] args){
  double length = 5.5d;
  double width = 2.5d ;  
	System.out.println("Length :" +length);
	System.out.println("Width :" +width);
}
}

// 13).Declare a variable isPositive of type boolean and assign it the result of checking whether num2 is positive.

public class Variables_13{
public static void main (String[] args){
	boolean isPositive = true;
	System.out.println("Num2 is positive:" +isPositive);
}
}

// 14).Create a variable greeting of type String and assign it the concatenated string "Hello, " and the value of name.

public class Variables_14{
public static void main (String[] args){
	String greeting = "Hello, Vinothini....";
	System.out.println(greeting);
}
}

// 15).Initialize a variable totalStudents of type int with the value 100.
public class Variables_15{
public static void main (String[] args){
	int totalStudents = 100;
	System.out.println(totalStudents);
}
}

// 16).Declare a variable isLeapYear of type boolean and assign it the result of checking whether the current
// year is a leap year.


public class Variables_16{
public static void main (String[] args){
	int year = 2024;
	if(year%4 == 0){
		System.out.println("2024 is LeapYear");
	}
}
}

import java.time.Year;
public class Variables_16{
public static void main (String[] args){
	boolean isLeapYear = Year.now().isLeap();
	System.out.println("Is the current year is LeapYear : " +isLeapYear);
}
}

// 17).Create variables price1 and price2 of type double and assign them values 10.50 and 20.75 respectively.
public class Variables_17{
public static void main (String[] args){
	double price1 = 10.50d;
	double price2 = 20.75d;
	System.out.println("The price1 value is :" +price1);
	System.out.println("The price1 value is :" +price1);	
}
}

 dout // 18).Declare a variable isVowel of type boolean and assign it the result of checking whether the 
//character in grade is a vowel.
import java.util.Scanner;
public class Variables_18{
public static void main (String[] args){
	System.out.println("Enter the letter : ");  
	char ch ;
	Scanner sc = new Scanner(System.in);
	ch = sc.next().charAt(0);
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
		System.out.println("It is vowel");
	}
	else{
		System.out.println("It not a vowel");
	}
}
}

// 19).Initialize variables hoursWorked and hourlyRate of type double with values 40.5 and 15.0 respectively.

public class Variables_19{
public static void main (String[] args){
	double hoursWorked = 40.5d;
	double hourlyRate = 15.0d;
	System.out.println("Total Hours Worked :" +hoursWorked);
	System.out.println("The Hours rate is :" +hourlyRate);
}
}

dout// 20).Declare a variable isPrime of type boolean and assign it the result of checking whether num3 is a prime number.
public class Variables_20{
public static void main (String[] args){
	boolean num3 = true;
	if(num3  == true){
		System.out.println("num3 is prime number");
	}
}
}







