import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите X: ");
        double x=sc.nextDouble();
        System.out.print("Введите N: ");
        int n=sc.nextInt();
        double sum=1;
        int sign=-1;
        for (int i=1; i<=n; i++) {
            double power=1;
            for (int j=1; j<=2*i; j++) {
                power=power*x;
            }
            long fact=1;
            for (int j=1; j<=2*i; j++) {
                fact=fact*j;
            }
            sum=sum+sign*power/fact;
            sign=-sign;
        }
        System.out.println("cos("+x+") = "+sum);
    }
}