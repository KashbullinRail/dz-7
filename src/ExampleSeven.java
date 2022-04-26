import java.time.LocalDate;

/**
 * SkyPro. My code dz#7
 *
 * @author RAIL
 * @version dated Apr 26, 2022
 */

public class ExampleSeven {

    //    ������� 1 ������   111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
    public static int leapYear(int year) {
        if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)) {
            printYearYes(year);
        } else printYearNo(year);
        return year;
    }

    public static void printYearYes(int year) {
        System.out.println(year + " - ���������� ���");
    }

    public static void printYearNo(int year) {
        System.out.println(year + " - �� ���������� ���");
    }

    public static void printExercise1() {
        System.out.println();
        System.out.println("������� 1");
    }
    //    ������� 1 �����    1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111

    //    ������� 2 ������   2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
    public static void printExercise2() {
        System.out.println();
        System.out.println("������� 2");
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
        System.out.println("���������� ���������� �� ���������");
    }

    public static void printPhoneAndroidLite() {
        System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
    }

    public static void printPhoneAndroidCustom() {
        System.out.println("���������� ������ ���������� ��� Android �� ������");
    }

    public static void printPhoneiOSLite() {
        System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
    }

    public static void printPhoneiOSCustom() {
        System.out.println("���������� ������ ���������� ��� iOS �� ������");
    }


//    ������� 2 �����    2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222

    //    ������� 3 ������   3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
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
        System.out.println("����������� ����: 1");
    }

    public static void printDeliveryDay2() {
        System.out.println("����������� ����: 2");
    }

    public static void printDeliveryDay3() {
        System.out.println("����������� ����: 3");
    }

    public static void printDeliveryDayNO() {
        System.out.println("�������� �� ������������");
    }

    public static void printExercise3() {
        System.out.println();
        System.out.println("������� 3");
    }
//    ������� 3 �����   33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333

//    ������� 4 ������  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444

    public static void stringValidation(String s) {
        char[] letter1 = s.toCharArray();
        char[] letter2 = s.toCharArray();
        boolean repeat = false;
        for (int i = 0; i < s.length(); i++) {
            for (int k = i + 1; k < s.length(); k++) {
                int kk = k + 1;
                if (letter2[i] == letter1[k]) {
                    System.out.println("��������� ����� ������� - " + "'" + letter1[k] + "'");
                    System.out.println("����� ������� �� ����� - " + kk);
                    repeat = true;
                    k = i = s.length();
                }
            }
        }
        if (repeat == false) {
            System.out.println("������������� �������� � ������ ���");
        }
    }

    public static void printExercise4() {
        System.out.println();
        System.out.println("������� 4");
    }
//    ������� 4 �����   44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444


    public static void main(String[] args) {

        // ������� 1
        printExercise1();
        int year = 1992;
        int a = leapYear(year);

        // ������� 2
        printExercise2();
        int clientOS = 1;
        int clientDeviceYear = 2021;
        int currentYear = LocalDate.now().getYear();
        int[] phoneParameters = {clientOS, clientDeviceYear, currentYear};
        int aa = telephone(phoneParameters);

        // ������� 3
        printExercise3();
        int deliveryDistance = 100;
        int b = delivery(deliveryDistance);

        // ������� 4
        printExercise4();
        stringValidation("aabccddefgghiijjkk");
    }
}