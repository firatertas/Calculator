import java.util.Scanner;

public class Main {
    static Scanner scan;

    static void plus() {
        scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". Sayı : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void minus() {
        scan = new Scanner(System.in);
        System.out.print("Girmek istediğiniz sayı yazınız : ");
        int count = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void times() {
        scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". Sayı : ");
            number = scan.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        scan = new Scanner(System.in);
        double number, result = 1;
        System.out.print("Kaç sayı girilecek : ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı : ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bölen 0 girilemez!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void power() {
        scan = new Scanner(System.in);
        int base, exporent, result = 1;
        System.out.print("Taban Değeri Giriniz : ");
        base = scan.nextInt();
        System.out.print("Üsy Değeri Giriniz : ");
        exporent = scan.nextInt();
        if (exporent == 0) {
            base = result;
        }
        for (int i = 1; i <= exporent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        scan = new Scanner(System.in);
        int n, result = 1;
        System.out.print("Sayı Giriniz : ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        scan = new Scanner(System.in);
        int number, result = 0;
        System.out.print("Modu alınacak sayıyı giriniz : ");
        number = scan.nextInt();

        result = number % 10;
        System.out.println("Sonuç : " + result);
    }

    static void rectangle() {
        scan = new Scanner(System.in);
        int number,a,b,result =0;
        System.out.print("A Kenarı : ");
        a = scan.nextInt();
        System.out.print("B Kenarı : ");
        b = scan.nextInt();
        System.out.println("Alan : "+(a*b));
        System.out.println("Çevre : "+2*(a+b));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "0-İşlemi sonlandır\n1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n5-Üs Alma İşlemi\n6-Faktoriyel Hesaplama\n7-Mod Alma\n8-Dikdörtgen Çevre Alan Hesabı";
        System.out.println(menu);
        do {

            System.out.print("Yapmak istediğin işlemi seç : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz.");

            }
        }while (select!=0);
        System.out.println("Güle Güle!");
    }
}