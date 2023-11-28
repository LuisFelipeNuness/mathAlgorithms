import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int delta = delta(a, b, c);

        double x1 = (Math.sqrt(delta) - b)/2*a;
        double x2 = (Math.sqrt(delta) + b)/2*a;

        System.out.println("X1 = " + x1 + " X2 = " + x2);
    }

    public static int delta(int a, int b, int c){
        return (b*b) - (4*a*c);
    }
}
