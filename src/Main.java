public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional operator lesson two!");

        System.out.println("Задание 1");
        /**
         * Мобильное приложение. Установка которого зависит от версии ОС на телефоне
         */
                int clientOS = 0; // У клиента Apple c iOS
                if(clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Andriod по ссылке.");
                }


        System.out.println("Задание 2");
        /**
         * Мобильное приложение. Установка в зависимости от версии ОС на телефоне, а также год создания
         * переменную clientOS не будем объявлять заново, будем использовать ее из предыдущего примера
         */
                int clientDeviceYear = 2015;
                if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для Android по ссылке.");
        } else {
            System.out.println("Что у Вас за устройство?");
        }

        System.out.println("Задание 3");
        /**
         * Определение високосности года
         * Високосный год - год, который кратен 4, но не кратен 100
         * исключение для годов, кратных 100 - годы, кратные 400
         */

                 int year =  2021;
                       if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                           System.out.println("Год " + year + " високосный");
                       } else {
                           System.out.println("Год " + year + " не високосный");
                       }

        System.out.println("Задание 4");
        /**
         * Срок доставки кредитных карт
         * до 20 км  - 1 день
         * от 20 до 60 км - 2 дня
         * от 60 до 100 км - 3 дня
         * от 100 км - нет доставки
         */
                int deliveryDistance = 95; // расстояние, предложенное в условиях задачи
                if (deliveryDistance <= 20) {
                    System.out.println("Для доставки карты на расстояние " + deliveryDistance + "  потребуется 1 день.");
                } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                    System.out.println("Для доставки карты на расстояние " + deliveryDistance + "  потребуется 2 дня.");
                } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Для доставки карты на расстояние " + deliveryDistance + "  потребуется 3 дня.");
                } else {
                    System.out.println(" Видимо расстояние слишком большое и туда карты не доставляют!");
                }

        System.out.println("Задание 5");
        /**
         * Программа по номеру месяца определяет сезон года
         * Если указан месяц более 12, то программа выдаст предупреждение
         * По умолчанию номер месяца 12
         */
        int monthNumber = 12; // значение по умолчанию
        switch (monthNumber){
            case 1, 2, 12 : System.out.println("Месяц " + monthNumber+ " относится к зимнему сезону");
                        break;
            case 3, 4, 5 : System.out.println("Месяц " + monthNumber+ " относится к весеннему сезону");
                        break;
            case 6, 7, 8 : System.out.println("Месяц " + monthNumber+ " относится к летнему сезону");
                        break;
            case 9, 10, 11 : System.out.println("Месяц " + monthNumber+ " относится к осеннему сезону");
                        break;
            default: System.out.println("Месяц указан не верно, то есть больше 12");
        }

    }
    }
