import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите A: ");
        double a=sc.nextDouble();
        System.out.println("Сумма: "+sumPowers(a));
    }
    static double sumPowers(double a) {
        return a*a+a*a*a*a+a*a*a*a*a*a;
    }
}