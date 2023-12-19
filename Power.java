import java.util.Scanner;
import java.lang.Long;

public class Power {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.printf("Base = ");
        int base = sc.nextInt();
        System.out.printf("Exponent = ");
        int exponent = sc.nextInt();
        
        System.out.printf("Result = " + pow(base, exponent));
    
    }
    
    private static Long pow(int base, int exponent){
        int cont = 0;
        long result=1;
        
        while(cont<exponent){
            result = result*base;
            cont++;
        }
        
        return Long.valueOf(result);
    }
    
    
}
