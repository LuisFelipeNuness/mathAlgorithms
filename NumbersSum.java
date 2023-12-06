import java.util.Scanner;

public class NumbersSum {
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int sum = numbersSum(n);
    	
	    System.out.println(sum);
    }
    
    public static int numbersSum(int n){
        return (n*(n+1))/2;
    }
}
