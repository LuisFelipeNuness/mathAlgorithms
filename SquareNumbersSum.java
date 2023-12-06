import java.util.Scanner;

public class SquareNumbersSum {
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int sum = squareNumbersSum(n);
    	
	    System.out.println(sum);
    }
    
    public static int squareNumbersSum(int n){
        return (n*(n+1)*(2*n+1))/6;
    }
}
