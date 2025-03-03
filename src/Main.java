import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkApplication(int clientOS, int year) {
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void checkDistance(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance >= 60 && distance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        //task1
        int year = 1987;
        checkYear(year);

        //task2
        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        checkApplication(clientOS, clientDeviceYear);

        //task3
        int deliveryDistance = 95;
        checkDistance(deliveryDistance);
    }
}