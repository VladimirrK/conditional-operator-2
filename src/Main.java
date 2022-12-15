public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        boolean leapYear = year % 4 == 0 || year % 400 == 0;
        boolean notLeapYear = year % 100 == 0;
        if (leapYear) {
            System.out.println("" + year + " год является високосным");
        } else if (notLeapYear) {
            System.out.println("" + year + " год не является високосным");
        } else {
            System.out.println("" + year + " год не является високосным");
        }
    }
}