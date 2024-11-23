public class Main {
    public static void main(String[] args) {

        //Зачада 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2

        int clientOs2 = 1;
        int clientDeviceYear = 2016;
        if (clientOs2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3

        int year = 1300;
        if (year < 1584) {
            System.out.println("Год не должен быть меньше 1584");
        } else if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4

        int deliveryDistance = 20;
        int delivereDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потрубуется " + delivereDays + " день доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            delivereDays++;
            System.out.println("Потребуется " + delivereDays + " дня доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            delivereDays++;
            delivereDays++;
            System.out.println("Потребуется " + delivereDays + " дня доставки");
        } else {
            System.out.println("Доставки нет");
        }

        //Задача 5

        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону весна");
                break;
            default:
                System.out.println("Больше месяцев нет");
        }
    }
}