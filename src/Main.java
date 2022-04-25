public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        } else if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке...");

        // Задание 2
        int clientDeviceYear = 2014;
        int clientOS1 = 1;
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ваша операционная система iOS, всё работает корректно.");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Ваша операционная система iOS, установите облегченную версию приложения по ссылке...");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ваша операционная система Android, всё работает корректно.");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015)  {
            System.out.println("Ваша операционная система Android, установите облегченную версию приложения по ссылке...");
    }
        // Задание 3
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным.");


        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставим за 1 день.");
        }else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доставка осуществима за 2 дня.");
        }else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Доставка осуществима за 3 дня.");
        }else if (deliveryDistance >100)    {
            System.out.println("Доставка неосуществима.");

        }
        // Задание 5
        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года: зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года: весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года: лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года: осень.");
                break;
        } if (monthNumber >= 13) {

                System.out.println("Такого месяца нет, введите значение с 1 (Январь) до 12 (Декабрь).");

        }


        }



    }




    }




