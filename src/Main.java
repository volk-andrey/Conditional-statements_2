public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 2");
        int year = 2015;
        int clientDeviceYear = 2014;
        clientOS = 1;
        boolean clientDevice = (clientDeviceYear < year);
        if (!clientDevice && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (!clientDevice && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDevice && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDevice && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Task 3");
        int yearForThirdTask = 1545;
        boolean yearIsValid = (yearForThirdTask > 1584);
        boolean yearIsLeap = (yearForThirdTask % 4 == 0 && yearForThirdTask % 100!= 0 || yearForThirdTask % 400 == 0);
        if (yearIsValid && yearIsLeap) {
            System.out.println(yearForThirdTask + " год является високосным");
        } else if (yearIsValid &&!yearIsLeap) {
            System.out.println(yearForThirdTask + " год не является високосным");
        } else if (!yearIsValid) {
            System.out.println("Все года до 1584 не являются високосными");
        }

        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }


/*        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }*/


        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12,1,2-> {System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");}
            case 3,4,5-> { System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");}
            case 6,7,8-> { System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");}
            case 9,10,11-> { System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");}
            default -> {System.out.println("Номер месяца больше 12");}
        }
    }
}