import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while (choice!=4) {
            System.out.println("1-Выполнить расчет");
            System.out.println("2-Информация о программе");
            System.out.println("3-Информация о разработчике");
            System.out.println("4-Выход");
            System.out.print("Выберите пункт: ");
            choice=sc.nextInt();
            if (choice==1) {
                calculate(sc);
            } else if (choice==2) {
                System.out.println("Программа вычисляет кинетическую энергию тела");
            } else if (choice==3) {
                System.out.println("Разработчик:студент второго курса УрФУ");
            } else if (choice==4) {
                System.out.println("Выход");
            } else {
                System.out.println("Неверный пункт меню");
            }
        }
    }
    static void calculate(Scanner sc) {
        double m=0;
        double v=0;
        while (m<=0) {
            System.out.print("Введите массу (кг): ");
            m=sc.nextDouble();
            if (m<=0) {
                System.out.println("Ошибка: масса должна быть больше нуля");
            }
        }
        while (v<0) {
            System.out.print("Введите скорость (м/с): ");
            v=sc.nextDouble();
            if (v<0) {
                System.out.println("Ошибка: скорость не может быть отрицательной");
            }
        }
        double e=m*v*v/2;
        System.out.println("Кинетическая энергия = "+e+" Дж");
    }
}