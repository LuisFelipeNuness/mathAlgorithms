import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int mdc = mdc(num1, num2);
		
		System.out.println(mdc);
	}
	
	public static int mdc(int num1, int num2){
	    int resto = 0;
	    while(true){
	        resto = num1 % num2;
	        if(resto == 0){
	            return num2;
	        }
	        num1 = num2;
	        num2 = resto;
	    } 
	} 
}
