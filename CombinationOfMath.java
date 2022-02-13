import java.util.Scanner;
public class Add {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = scan.nextInt();
		System.out.println("Input the second number: ");
		int b = scan.nextInt();
		int sum= a+b;
		System.out.println(a +" + "+ b +" = "+ sum);



	}
}



import java.util.Scanner;
public class Minus {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = scan.nextInt();
		System.out.println("Input the second number: ");
		int b = scan.nextInt();
		int sub= a-b;
		System.out.println(a +" - "+ b +" = "+ sub);



	}
}



import java.util.Scanner;
public class Multiply {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = scan.nextInt();
		System.out.println("Input the second number: ");
		int b = scan.nextInt();
		int mul= a*b;
		System.out.println(a +" * "+ b +" = "+ mul);



	}
}



import java.util.Scanner;
public class DivideBonus {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = scan.nextInt();
		System.out.println("Input the second number: ");
		int b = scan.nextInt();
		double d = a/ (double) b ;
		
		if( a % b ==0) {
	    	System.out.println(a +" / "+ b +" = "+ a/b);
	        }
     		   else {
           		 System.out.println(a +" / "+ b + " = " + d );
            
     	  	 }

	}
}