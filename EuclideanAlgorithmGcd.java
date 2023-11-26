import java.util.Scanner;

public class EuclideanAlgorithm
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int gcd = gcd(num1, num2);
		
		System.out.println(mdc);
	}
	
	public static int gcd(int num1, int num2){
	    int remainder = 0;
	    while(true){
	        remainder = num1 % num2;
	        if(resto == 0){
	            return num2;
	        }
	        num1 = num2;
	        num2 = remainder;
	    } 
	} 
}
