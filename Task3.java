import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите N: ");
        int n=sc.nextInt();
        int result=0;
        while (n>0) {
            result=result*10+n%10;
            n=n/10;
        }
        System.out.println("Перевернутое число: "+result);
    }
}