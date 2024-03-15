package InterviewProgram;

public class Palindrome {

	public static void main(String[] args) {
		 String s = "level";
	     int n = s.length();
	     String rev = "";
	     
	     for(int i=n-1; i>=0; i--){
	         rev = rev  + s.charAt(i);
	     }
	     System.out.println(rev);
	     if(s.equals(rev)){
	         System.out.println("It is Palindrome");
	     }
	     else{
	         System.out.println("It is not a Palindrome");
	     }

	}

}
