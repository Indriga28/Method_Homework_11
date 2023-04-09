import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
    int year = 3002;
    checkYear(year);
    }
    public static void checkYear (int year) {
        if (year % 4 == 0 && year % 100 != 1 || year % 400 ==0) {
            System.out.println("Год високосный.");
        } else if (year % 4 != 0 && year % 100 == 0 || year % 400 != 0) {
            System.out.println("It is not a leap year.");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
    int clientOS = 0;
    int clientDeviceYear = 2040;
    checkUser(clientOS, clientDeviceYear);
    }
    public static void checkUser (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear > currentYear) {
            System.out.println("Download the app for IOS following the link");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Download the light version of the app for IOS following the link.");
        } else if (clientOS == 1 && clientDeviceYear > currentYear) {
            System.out.println("Download the app for Android following the link");
        } else {
            System.out.println("Download the light version of the app for Android following the link");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
    int deliveryDistance = 59;
    int deliveryDays = deliver (deliveryDistance);
        System.out.println(deliveryDays);
    }
    public static int deliver (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >60 && deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }


}