import java.time.LocalDate;

/**
 * SkyPro. My code dz#7
 *
 * @author RAIL
 * @version dated Apr 26, 2022
 */

public class ExampleSeven {

    //    Задание 1 Начало   111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
    public static int leapYear(int year) {
        if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)) {
            printYearYes(year);
        } else printYearNo(year);
        return year;
    }

    public static void printYearYes(int year) {
        System.out.println(year + " - високосный год");
    }

    public static void printYearNo(int year) {
        System.out.println(year + " - не високосный год");
    }

    public static void printExercise1() {
        System.out.println();
        System.out.println("Задание 1");
    }
    //    Задание 1 Конец    1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111

    //    Задание 2 Начало   2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
    public static void printExercise2() {
        System.out.println();
        System.out.println("Задание 2");
    }

    public static int telephone(int[] phoneParameters) {
        int clientOS = phoneParameters[0];
        int clientDeviceYear = phoneParameters[1];
        int currentYear = phoneParameters[2];
        if ((currentYear - clientDeviceYear) < 1) {
            printPhoneNo();
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                printPhoneiOSLite();
            } else printPhoneiOSCustom();
        } else if (clientDeviceYear < 2015) {
            printPhoneAndroidLite();
        } else printPhoneAndroidCustom();
        return clientOS;
    }

    public static void printPhoneNo() {
        System.out.println("Обновление приложения не требуется");
    }

    public static void printPhoneAndroidLite() {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    public static void printPhoneAndroidCustom() {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void printPhoneiOSLite() {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void printPhoneiOSCustom() {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }


//    Задание 2 Конец    2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222

    //    Задание 3 Начало   3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
    public static int delivery(int deliveryDistance) {
        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 60) {
                if (deliveryDistance <= 20) {
                    printDeliveryDay1();
                } else printDeliveryDay2();
            } else printDeliveryDay3();
        } else printDeliveryDayNO();
        return deliveryDistance;
    }

    public static void printDeliveryDay1() {
        System.out.println("Потребуется дней: 1");
    }

    public static void printDeliveryDay2() {
        System.out.println("Потребуется дней: 2");
    }

    public static void printDeliveryDay3() {
        System.out.println("Потребуется дней: 3");
    }

    public static void printDeliveryDayNO() {
        System.out.println("Доставка не производится");
    }

    public static void printExercise3() {
        System.out.println();
        System.out.println("Задание 3");
    }
//    Задание 3 Конец   33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333

//    Задание 4 Начало  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444

    public static void stringValidation(String s) {
        char[] letter1 = s.toCharArray();
        char[] letter2 = s.toCharArray();
        boolean repeat = false;
        for (int i = 0; i < s.length(); i++) {
            for (int k = i + 1; k < s.length(); k++) {
                int kk = k + 1;
                if (letter2[i] == letter1[k]) {
                    System.out.println("Обнаружен дубль символа - " + "'" + letter1[k] + "'");
                    System.out.println("Номер символа по счету - " + kk);
                    repeat = true;
                    k = i = s.length();
                }
            }
        }
        if (repeat == false) {
            System.out.println("Повторяющихся символов в строке нет");
        }
    }

    public static void printExercise4() {
        System.out.println();
        System.out.println("Задание 4");
    }
//    Задание 4 Конец   44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444


    public static void main(String[] args) {

        // Задание 1
        printExercise1();
        int year = 1992;
        int a = leapYear(year);

        // Задание 2
        printExercise2();
        int clientOS = 1;
        int clientDeviceYear = 2021;
        int currentYear = LocalDate.now().getYear();
        int[] phoneParameters = {clientOS, clientDeviceYear, currentYear};
        int aa = telephone(phoneParameters);

        // Задание 3
        printExercise3();
        int deliveryDistance = 100;
        int b = delivery(deliveryDistance);

        // Задание 4
        printExercise4();
        stringValidation("aabccddefgghiijjkk");
    }
}