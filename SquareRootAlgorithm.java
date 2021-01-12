import java.util.*;
import java.lang.*;

public class SquareRootAlgorithm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double a = 2.0;
        while (Math.abs(a - (N/a)) > .01){
            double temp = N/a;
            a = (a + temp) / 2;
        }
             
        System.out.println((int) a);
    }
}