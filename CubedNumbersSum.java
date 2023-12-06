import java.util.Scanner;

public class CubedNumbersSum {
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int sum = cubedNumbersSum(n);
    	
	    System.out.println(sum);
    }
    
    public static int cubedNumbersSum(int n){
        return ((n*(n+1))/2)*((n*(n+1))/2);
    }
}
