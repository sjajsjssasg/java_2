import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите A: ");
        int a=sc.nextInt();
        System.out.print("Введите B: ");
        int b=sc.nextInt();
        int count=0;
        for (int i=b; i>=a; i--) {
            System.out.print(i+" ");
            count++;
        }
        System.out.println();
        System.out.println("Количество: "+count);
    }
}