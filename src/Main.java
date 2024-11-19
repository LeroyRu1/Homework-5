public class Main {
    public static void main(String[] args) {

        //Зачада 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2

        int clientOs2 = 1;
        int clientDeviceYear = 2014;
        if (clientOs2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (clientOs2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOs2 ==1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3

        int year = 1583;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        // Задача 4

        int deliveryDistance = 100;
        int delivereDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потрубуется " + delivereDays + " день доставки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
        delivereDays++;
            System.out.println("Потребуется " + delivereDays + " дня доставки");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            delivereDays++;
            delivereDays++;
            System.out.println("Потребуется " + delivereDays + " дня доставки");
        }
        if (deliveryDistance > 100){
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