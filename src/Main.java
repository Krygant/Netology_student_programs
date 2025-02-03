import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            int days = scanner.nextInt();
            if (daysPerYear(year) == days) {
                count++;
            } else {
                System.out.println("Неправильно! В этом году " + daysPerYear(year) + " дней!");
                System.out.println("Набрано очков: " + count);
                break;
            }
        }

    }
    public static int daysPerYear(int year){
        int  days;
        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else  if (year % 4 == 0) {
            days = 366;
        } else {
            days = 365;
        }

        return days;
    }
}